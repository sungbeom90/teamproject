package com.mycompany.teamproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.controller.RegisterController;
import com.mycompany.teamproject.dao.LocationDao;
import com.mycompany.teamproject.dao.MemberDao;
import com.mycompany.teamproject.dao.NationDao;
import com.mycompany.teamproject.dto.LocationDto;
import com.mycompany.teamproject.dto.NationDto;

@Service
public class LocationService {
	private static final Logger logger=LoggerFactory.getLogger(LocationService.class);
	
	@Resource
	private LocationDao locationDao;
	
	//도시별 리스트 불러오기. dao로 요청
	
	public List<LocationDto> getLocationList() {
		logger.info("실행");
		List<LocationDto> list = locationDao.selectLocationlist();
		return list;
	}
	public LocationDto getLocation(int location_id) {
		logger.info("실행");
		LocationDto lDto = locationDao.selectLocation(location_id);
		return lDto;
	}
	
	
	public List<LocationDto> getLocations(int Nation_id) {
		logger.info("실행");
		List<LocationDto> list = locationDao.selectLocations(Nation_id);
		return list;
	}
	
	
}
