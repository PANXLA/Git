package com.service;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.CarsMapper;
import com.pojo.Cars;
import com.pojo.User;
import com.pojo.Users;

@Service("carsService")
public class CarService {
	@Resource
	private CarsMapper dao;
	public Cars findById(int id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}
	public List<HashMap> findAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}
	public void addCarInfo(Cars car) {
		// TODO Auto-generated method stub
		dao.insertCar(car);
	}
	public List<HashMap> findByPage(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		return dao.findByPage(pd);
	}
	public int carscount() {
		// TODO Auto-generated method stub
		return dao.carscount();
	}
	public void delById(Cars car) {
		// TODO Auto-generated method stub
		dao.delById(car);
	}
	public void addorder(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		dao.addorder(pd);
	}
	public List<HashMap> rentcarinfo(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		return dao.rentcarinfo(pd);
	}
	public int rentcarinfocount() {
		// TODO Auto-generated method stub
		return dao.rentcarinfocount();
	}
	public void addtimerange(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		dao.addtimerange(pd);
	}
	public void updatecar(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		dao.updatecar(pd);
	}
	public void updatecarstats() {
		// TODO Auto-generated method stub
		dao.updatecarstats();
	}
	public List<HashMap> checkTimeRange(HashMap<String, Object> pd) {
		// TODO Auto-generated method stub
		return dao.checkTimeRange(pd);
	}

}
