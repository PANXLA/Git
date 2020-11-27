package com.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Cars;
import com.pojo.User;
import com.pojo.Users;
import com.service.CarService;
import com.service.UserService;
import com.service.UsersService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/car")  
public class carController {
	@Resource(name="carsService")
	private CarService carService;
	@Resource(name="usersService")
	private UsersService usersService;
	@RequestMapping(value="/resqueryById")
	public ModelAndView resqueryById(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("single");
		return mv;
	}
	@ResponseBody
	@RequestMapping(value="/queryById")
	public Object queryById(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		String id =request.getParameter("Id");
		try{
			Cars car= carService.findById(Integer.parseInt(id));
			String carColor=car.getColor();
			//Date buyTime=car.getBuyTime();
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			//System.out.println("当前时间：" + sdf.format(buyTime));
			return car;
		} catch(Exception e){
            e.printStackTrace();
            return null;
		}
		
	}
	@ResponseBody
	@RequestMapping(value="/queryAll")
	public String queryAll(HttpServletRequest request,int page, int limit){
		ModelAndView mv = new ModelAndView();
		List<HashMap> listcars=null;
		String js;
		String jso;
		int count=0;
		try{
			HashMap<String,Object> pd=new HashMap();
			//usersList= usersService.findAll();
			int before = limit * (page - 1);
			int after = limit;
			pd.put("before", before);
			pd.put("after", after);
			//listcars= carService.findAll();
			listcars=carService.findByPage(pd);
			count=carService.carscount();
			int listSize=listcars.size();
			System.out.println("集合长度："+listSize);
			JSONArray json = JSONArray.fromObject(listcars);
			 js = json.toString();
			 jso = "{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";//转为layui需要的json格式
			 return jso;
		} catch(Exception e){
            e.printStackTrace();
            return "redirect:/404.html";
		}
		
	}
	
	@ResponseBody
	@RequestMapping(value="/queryunrentcar")
	public Object queryunrentcar(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		List<HashMap> listcars=null;
		String js;
		String jso;
		int count=0;
		try{
			listcars= carService.findAll();
			 return listcars;
		} catch(Exception e){
            e.printStackTrace();
            return "redirect:/404.html";
		}
		
	}
	
	@RequestMapping(value="/requestAddCarInfo")
	public Object requestAddCarInfo(HttpServletRequest request){
		return "redirect:/addcarinfo.html";
	}
	@RequestMapping(value="/addCarInfo")
	public String addCarInfo(HttpServletRequest request,MultipartFile carimag){
		ModelAndView mv = new ModelAndView();
		try{
			//String path = request.getRealPath("/upload/");
			String path="C:\\upload\\";
			String uuid = UUID.randomUUID().toString().replaceAll("-",""); 
			String carNumber=request.getParameter("CarNumber");
			String color=request.getParameter("Color");
			String carType=request.getParameter("CarType");
			String price=request.getParameter("Price");
			String deposit=request.getParameter("");
			String rentPrice=request.getParameter("RentPrice");
			String isRenting="未出租";
			String description=request.getParameter("Description");
			String byTime=request.getParameter("buyTime");
			String carImagFileName=carimag.getOriginalFilename();
			String insuraInfo=request.getParameter("insurainfo");;
			String weiHuInfo=request.getParameter("weihuinfo");
			String weiZhangInfo=request.getParameter("weizhanginfo");
			String timeRange=request.getParameter("timeRange");
			String carImagPath=path+uuid+carImagFileName;
			if(!new File(carImagPath).exists())
			{
				new File(carImagPath).mkdirs();
			}
			carimag.transferTo(new File(carImagPath));
			Cars car=new Cars();
			car.setBuyTime(request.getParameter("buyTime"));
			car.setCarimag(uuid+carImagFileName);
			car.setCarnumber(carNumber);
			car.setCartype(carType);
			car.setColor(color);
			car.setDeposit(1.0);
			car.setDescription(description);
			car.setInsurainfo(insuraInfo);
			car.setIsrenting(isRenting);
			car.setPrice(2000.0);
			//car.setRentprice(Integer.parseInt(rentPrice)+0.0);
			car.setTimerange(timeRange);
			car.setWeihuinfo(weiHuInfo);
			car.setWeizhanginfo(weiZhangInfo);
			carService.addCarInfo(car);
		} catch(Exception e){
            e.printStackTrace();
            return "redirect:/404.html";
		}
		return "redirect:/admincaidan.html";
	}
	@RequestMapping(value="/delById")
	public String delById(HttpServletRequest request){
		String id=request.getParameter("Id");
		//Users user=new Users();
		Cars car=new Cars();
		car.setId(Integer.parseInt(id));
		try {
			carService.delById(car);
			//return "redirect:/usercaidan.html";
			return "redirect:users/requestadduser.do";
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "redirect:/404.html";
		}
		
		
	}
	@RequestMapping(value="/backindex")
	public String responsexianshi(HttpServletRequest request)
	{
		return "redirect:/index.html";
	}
	@RequestMapping(value="/rentcar")
	public String rentcar(HttpServletRequest request)
	{
		String carid = request.getParameter("Id");
		HttpSession session = request.getSession();
		int userid = (int)session.getAttribute("Id");
		HashMap<String,Object> pd=new HashMap<>();
		pd.put("userid",userid+"");
		pd.put("carid", carid);
		List<Map> userList=null;
		//HttpSession session = request.getSession();
		int id = (int)session.getAttribute("Id");
		HashMap<String,Object> pd1=new HashMap();
		pd1.put("id",id);
		userList=usersService.checkstats(pd1);
		int checkstate=(int)userList.get(0).get("checkstate");
		
		try {
			if(checkstate==1)
			{
			List<Map> listhisOrder=usersService.findOrderByuserId(pd);
			if(listhisOrder.size()>0)
			{
				usersService.delorder(pd);
			}
			carService.addorder(pd);
			carService.updatecar(pd);
			return "redirect:/success.html";
			}
			else
			{
				return "redirect:/fail.html";
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "redirect:/404.html";
		}
		
	}
	
	
	@ResponseBody
	@RequestMapping(value="/rentcarinfo")
	public String rentcarinfo(HttpServletRequest request,int page, int limit){
		ModelAndView mv = new ModelAndView();
		List<HashMap> rentcarinfoList=null;
		String js;
		String jso;
		int count=0;
		try{
			HashMap<String,Object> pd=new HashMap();
			//usersList= usersService.findAll();
			int before = limit * (page - 1);
			int after = limit;
			pd.put("before", before);
			pd.put("after", after);
			rentcarinfoList=carService.rentcarinfo(pd);
			count=carService.rentcarinfocount();
			//int listSize=listcars.size();
			//System.out.println("集合长度："+listSize);
			JSONArray json = JSONArray.fromObject(rentcarinfoList);
			 js = json.toString();
			 jso = "{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";//转为layui需要的json格式
			 return jso;
		} catch(Exception e){
            e.printStackTrace();
            return "redirect:/404.html";
		}
		
	}
	
	@RequestMapping(value="/addtimerange")
	public String addtimerange(HttpServletRequest request){
		HttpSession session = request.getSession();
		int userid = (int)session.getAttribute("Id");
		HashMap<String,Object> pd=new HashMap<>();
		List<HashMap> timeRangeList=null;
		String timeRange=request.getParameter("timeRange");
		pd.put("userid",userid+"");
		pd.put("timeRange",timeRange);
		try {
			timeRangeList=carService.checkTimeRange(pd);
			if(timeRangeList.size()>0)
			{
				String stats=(String) timeRangeList.get(0).get("stats");
				if(timeRange==stats||timeRange.equals(stats))
				{
					return "redirect:/addtimerangefail.html";
				}
				if(stats=="白班"||"白班".equals(stats))
				{
					if("AM5点-PM1点".equals(timeRange)||"PM1点-PM9点".equals(timeRange)||"PM9点-AM5点".equals(timeRange))
					{
						return "redirect:/addtimerangefail.html";
					}
				}
				if(stats=="夜班"||"夜班".equals(stats))
				{
					if("AM5点-PM1点".equals(timeRange)||"PM1点-PM9点".equals(timeRange)||"PM9点-AM5点".equals(timeRange))
					{
						return "redirect:/addtimerangefail.html";
					}
				}
				if(stats=="AM5点-PM1点"||"AM5点-PM1点".equals(stats))
				{
					if("白班".equals(timeRange)||"夜班".equals(timeRange))
					{
						return "redirect:/addtimerangefail.html";
					}
				}
				if(stats=="PM1点-PM9点"||"PM1点-PM9点".equals(stats))
				{
					if("白班".equals(timeRange)||"夜班".equals(timeRange))
					{
						return "redirect:/addtimerangefail.html";
					}
				}
				if(stats=="PM9点-AM5点"||"PM9点-AM5点".equals(stats))
				{
					if("白班".equals(timeRange)||"夜班".equals(timeRange))
					{
						return "redirect:/addtimerangefail.html";
					}
				}
			}
			if("白班".equals(timeRange))
			{
				pd.put("price", "250"+"");
			}
			if("夜班".equals(timeRange))
			{
				pd.put("price", "200"+"");
			}
			
			if("AM5点-PM1点".equals(timeRange))
			{
				pd.put("price", "180"+"");
			}
			if("PM1点-PM9点".equals(timeRange))
			{
				pd.put("price", "230"+"");
			}
			if("PM9点-AM5点".equals(timeRange))
			{
				pd.put("price", "150"+"");
			}
			
			carService.addtimerange(pd);
			//return "redirect:/usercaidan.html";
			return "redirect:/usercaidan.html";
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "redirect:/404.html";
		}
		
		
	}
	
	

}
