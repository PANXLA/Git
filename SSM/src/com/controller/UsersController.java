package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.User;
import com.pojo.Users;
import com.service.CarService;
import com.service.UserService;
import com.service.UsersService;

import net.sf.json.JSONArray;
@Controller
@RequestMapping("/users")  
public class UsersController {
	
	    @Resource(name="carsService")
	    private CarService carService;
		@Resource(name="usersService")
		private UsersService usersService;
		/**
		 * 鏍规嵁id鏌ヨ
		 */
		@RequestMapping(value="/login")
		public Object queryById(HttpServletRequest request){
			ModelAndView mv = new ModelAndView();
			HttpSession session = request.getSession();
			
			
			String userName = request.getParameter("userName");
			String passWord=request.getParameter("passWord");
			Users users=new Users();
			users.setUsername(userName);
			users.setPassword(passWord);
			
			try{
				Users listUsers= usersService.login(users);
				String userType=listUsers.getUsertype();
				session.setAttribute("Id",listUsers.getId());
				if(userType=="普通用户"||"普通用户".equals(userType))
				{
					return "redirect:/usercaidan.html";
				}
			} catch(Exception e){
	            e.printStackTrace();
	            return "redirect:/passworderror.html";
			}
			return "redirect:/admincaidan.html";
		}
		
		@RequestMapping(value="/backIndex")
		public String  backIndex(HttpServletRequest request)
		{
			int id = (int)request.getSession().getAttribute("Id");
			if(id==1)
			{
				return "redirect:/usercaidan.html";
			}
			return "redirect:/admincaidan.html";
		}
		@RequestMapping(value="/requestadduser")
		public Object requestadduser(HttpServletRequest request)
		{
			return "redirect:/adduserinfo.html";
		}
		
		@RequestMapping(value="/adduser")
		public String adduser(MultipartFile drivimag,MultipartFile idimag,HttpServletRequest request,HttpServletResponse response){
			//int id=(int)request.getSession().getAttribute("Id");
			ModelAndView mv = new ModelAndView();
			boolean flag=false;
			String path = "C:\\upload\\";
			File file = new File(path);
			if(!file.exists())
			{
			   file.mkdirs(); 
			}
			String uuid = UUID.randomUUID().toString().replaceAll("-",""); 
			String drivImagFileName=drivimag.getOriginalFilename();
			try{
			String idImagFileName = idimag.getOriginalFilename();
			//String userName = request.getParameter("idimag");
			file.getName();
			//String fileName=users.getDrivimag().getName();
			//String fileName=users.getFile().getName();
			String userName=request.getParameter("Username");
			String realName=request.getParameter("RealName");
			String passWord=request.getParameter("PassWord");
			String gender=request.getParameter("Gender");
			String address=request.getParameter("Address");
			String identity=request.getParameter("Identity");
			String tel=request.getParameter("Tel");
			String position=request.getParameter("position");
			String nation=request.getParameter("nation");
			String drivinfo=request.getParameter("drivinfo");
			String drivimagPath=path+uuid+"driv"+drivImagFileName;
			String drivage=request.getParameter("drivage");
			String idImag=path+uuid+"id"+idImagFileName;
			String age=request.getParameter("age");
			drivimag.transferTo(new File(drivimagPath));
			idimag.transferTo(new File(idImag));
			Users users=new Users();
			users.setUsername(userName);
			users.setAddress(address);
			users.setDrivage(drivage);
			users.setDrivimag(drivImagFileName);
			users.setDrivinfo(drivinfo);
			users.setGender(gender);
			users.setIdentity(identity);
			users.setIdimag(idImagFileName);
			users.setNation(nation);
			users.setPassword(passWord);
			users.setPosition(position);
			users.setRealname(realName);
			users.setTel(tel);
			users.setAge(Integer.parseInt(age));
			
				usersService.adduser(users);
				flag=true;
				if(flag)
				{
					/*response.setContentType("text/html; charset=UTF-8"); //杞爜
				    PrintWriter out = response.getWriter();
				    out.flush();
				    out.println("<script>");
				    out.println("alert('娣诲姞鎴愬姛锛�');");
				    out.println("history.back();");
				    out.println("</script>");*/
					
				}
				
			} catch(Exception e){
	            e.printStackTrace();
	            return "redirect:/404.html";
			}
		
			return "redirect:/login.html";
		}
		@ResponseBody
		@RequestMapping(value="/findbyid")
		public Object findById(HttpServletRequest request){
			ModelAndView mv = new ModelAndView();
			String id=request.getParameter("Id");
			Users users=new Users();
			users.setId(Integer.parseInt(id));
			Users userInfo=null;
			try{
				userInfo = usersService.findById(users);
				//String passWord=userInfo.getPassword();
				//System.out.println("瀵嗙爜锛�"+passWord);
				//mv.setViewName("index");
				//mv.addObject("var", listUsers);
				return userInfo;
			} catch(Exception e){
	            e.printStackTrace();
	            return "redirect:/404.html";
			}
			
		}
		@ResponseBody
		@RequestMapping(value="/userinfo")
		public Object userinfo(HttpServletRequest request){
			ModelAndView mv = new ModelAndView();
			HttpSession session = request.getSession();
			int id = (int)session.getAttribute("Id");
			Users users=new Users();
			users.setId(id);
			Users userInfo=null;
			try{
				userInfo = usersService.findById(users);
				JSONArray json = JSONArray.fromObject(userInfo);
				 String js = json.toString();
				 String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+1+",\"data\":"+js+"}";//转为layui需要的json格式
				 return jso;
			} catch(Exception e){
	            e.printStackTrace();
	            return "redirect:/404.html";
			}
			
		}
		
		@ResponseBody
		@RequestMapping(value="/findAll")
		public String findAll(HttpServletRequest request,int page, int limit){
			ModelAndView mv = new ModelAndView();
			List<Map> usersList=null;
			int count=0;
			try{
				HashMap<String,Object> pd=new HashMap();
				//usersList= usersService.findAll(S);
				int before = limit * (page - 1);
				int after = limit;
				pd.put("before", before);
				pd.put("after", after);
				usersList=usersService.findByPage(pd);
				count=usersService.userscount();
				System.out.print("长度："+usersList.size());
				JSONArray json = JSONArray.fromObject(usersList);
				 String js = json.toString();
				 String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";//转为layui需要的json格式
				 return jso;
				//String passWord=userInfo.getPassword();
				//System.out.println("瀵嗙爜锛�"+passWord);
				//mv.setViewName("index");
				//mv.addObject("var", listUsers);
			} catch(Exception e){
	            e.printStackTrace();
	            return "redirect:/404.html";
			}
			
			
		}
		@RequestMapping(value="/delById")
		public String delById(HttpServletRequest request){
			String id=request.getParameter("Id");
			Users user=new Users();
			user.setId(Integer.parseInt(id));
			try {
				usersService.delById(user);
				//return "redirect:/usercaidan.html";
				return "redirect:users/requestadduser.do";
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "redirect:/404.html";
			}
			
			
		}
		@ResponseBody
		@RequestMapping(value="/finduncheck")
		public String finduncheck(HttpServletRequest request,int page, int limit){
			ModelAndView mv = new ModelAndView();
			List<Map> usersList=null;
			int count=0;
			HashMap<String,Object> pd=new HashMap();
			//usersList= usersService.findAll(S);
			int before = limit * (page - 1);
			int after = limit;
			pd.put("before", before);
			pd.put("after", after);
			try {
				usersList=usersService.finduncheck(pd);
				count=usersService.userscount();
				System.out.print("长度："+usersList.size());
				JSONArray json = JSONArray.fromObject(usersList);
				 String js = json.toString();
				 String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+js+"}";//转为layui需要的json格式
				 return jso;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "redirect:/404.html";
			}
			
		}
		
		@RequestMapping(value="/agree")
		public String check(HttpServletRequest request){
			String id=request.getParameter("Id");
			Users user=new Users();
			user.setId(Integer.parseInt(id));
			usersService.agree(user);
			return "redirect:/checkuser.html";
		}
		@ResponseBody
		@RequestMapping(value="/updateuser")
		public Object updateuser(HttpServletRequest request){
			ModelAndView mv=new ModelAndView();
			HashMap<String,Object> pd=new HashMap();
			String result="";
			HttpSession session = request.getSession();
			int id = (int)session.getAttribute("Id");
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			String address=request.getParameter("address");
			String position=request.getParameter("position");
			String tel=request.getParameter("tel");
			String identity=request.getParameter("identity");
			String realname=request.getParameter("realname");
			String nation=request.getParameter("nation");
			String age=request.getParameter("age");
			String drivage=request.getParameter("drivage");
			String gender=request.getParameter("gender");
			Users user=new Users();
			user.setId(id);
			user.setAddress(address);
			user.setAge(Integer.parseInt(age));
			user.setIdentity(identity);
			user.setNation(nation);
			user.setPassword(password);
			user.setPosition(position);
			user.setRealname(realname);
			user.setTel(tel);
			user.setUsername(username);
			user.setDrivage(drivage);
			user.setGender(gender);
			try {
				usersService.updateuser(user);
				result="suc";
				pd.put("result",result);
				return pd;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "redirect:/404.html";
			}
			
			
		}
		@ResponseBody
		@RequestMapping(value="/carinfo")
		public String carinfo(HttpServletRequest request){
			ModelAndView mv = new ModelAndView();
			List<Map> orderList=null;
			List<Map> mycarinfo=null;
			HashMap<String,Object> pd=new HashMap();
			try {
				 HttpSession session = request.getSession();
				 int id = (int)session.getAttribute("Id");
				 pd.put("Id",id);
				 //orderList=usersService.findOrderByuserId(pd);
				 //String carid=(String)orderList.get(0).get("carid");
				 HashMap<String,Object> page=new HashMap();
				 //page.put("", value);
				 mycarinfo=usersService.findCarByUserid(pd);
				// System.out.print("长度："+usersList.size());
				 JSONArray json = JSONArray.fromObject(mycarinfo);
				 String js = json.toString();
				 String jso = "{\"code\":0,\"msg\":\"\",\"count\":"+1+",\"data\":"+js+"}";//转为layui需要的json格式
				 return jso;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "redirect:/404.html";
			}
			
		}
		@ResponseBody
		@RequestMapping(value="/delOrder")
		public Object delOrder(HttpServletRequest request){
			ModelAndView mv=new ModelAndView();
			String result="";
			String id=request.getParameter("id");
			HashMap<String,Object> pd=new HashMap();
			pd.put("userid",id);
			usersService.delorder(pd);
			carService.updatecarstats();
			result="suc";
			//mv.setViewName("usercaidan");
			pd.put("result",result);
			return pd;
		}
		
		@RequestMapping(value="/checkstats")
		public String checkstats(HttpServletRequest request){
			ModelAndView mv=new ModelAndView();
			List<Map> userList=null;
			HttpSession session = request.getSession();
			int id = (int)session.getAttribute("Id");
			HashMap<String,Object> pd=new HashMap();
			pd.put("id",id);
			userList=usersService.checkstats(pd);
			int checkstate=(int)userList.get(0).get("checkstate");
			if(checkstate==1)
			{
				//mv.setViewName("index");
				return "redirect:/index.html";
			}
			else
			{
				/*Object[] options= {"确定"};
				JOptionPane.showOptionDialog(null,"审核未通过，请等待管理员审核。","提示", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
				*/
				
				return "redirect:/usercaidan.html";
			}
			
		}
		
		
	}
