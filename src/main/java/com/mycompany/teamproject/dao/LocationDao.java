package com.mycompany.teamproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.LocationDto;
import com.mycompany.teamproject.dto.LocationPager;


@Repository
public class LocationDao {
	private static final Logger logger=LoggerFactory.getLogger(LocationDao.class);
	
	@Resource
	private SqlSessionTemplate sst;
	
	public List<LocationDto> selectLocationlist() {
		logger.info("실행");
		List<LocationDto> list = sst.selectList("locations.selectAll");
		return list;
	}
	

	public LocationDto selectLocation(int location_id) {
		logger.info("실행");
		LocationDto lDto = sst.selectOne("locations.selectByPk", location_id);
		return lDto;
	}
	
	public List<LocationDto> selectLocations(int nation_id) {
		logger.info("실행");
		List<LocationDto> list = sst.selectList("locations.selectByFk", nation_id);
		return list;
	}

//----------------------------------------------------------------------------
	public List<LocationDto> selectByPage(LocationPager pager) {
		List<LocationDto> list = sst.selectList("locations.selectByPage",pager);
		return list;
	}


	public int countAll() {
		logger.info("값 확인");
		int count = sst.selectOne("locations.countAll");
		
		return count;
	}
}
