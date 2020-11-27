package com.mapper;

import com.pojo.Cars;
import com.pojo.CarsExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarsMapper {
    int countByExample(CarsExample example);

    int deleteByExample(CarsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cars record);

    int insertSelective(Cars record);

    List<Cars> selectByExample(CarsExample example);

    Cars selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cars record, @Param("example") CarsExample example);

    int updateByExample(@Param("record") Cars record, @Param("example") CarsExample example);

    int updateByPrimaryKeySelective(Cars record);

    int updateByPrimaryKey(Cars record);

	List<HashMap> selectAll();

	void insertCar(Cars car);

	List<HashMap> findByPage(HashMap<String, Object> pd);

	int carscount();

	void delById(Cars car);

	void addorder(HashMap<String, Object> pd);

	List<HashMap> rentcarinfo(HashMap<String, Object> pd);

	int rentcarinfocount();

	void addtimerange(HashMap<String, Object> pd);

	void updatecar(HashMap<String, Object> pd);

	void updatecarstats();

	List<HashMap> checkTimeRange(HashMap<String, Object> pd);
}