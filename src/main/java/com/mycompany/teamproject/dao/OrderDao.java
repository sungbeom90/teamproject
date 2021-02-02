package com.mycompany.teamproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.NationDto;
import com.mycompany.teamproject.dto.OrderDto;




@Repository
public class OrderDao {
	private static final Logger logger 
			= LoggerFactory.getLogger(OrderDao.class);
	
	@Resource
	private SqlSessionTemplate sst;

	public int insertOrder(OrderDto order) {
		logger.info("실행");
		int rows = sst.insert("orders.insertorder",order);
		return rows;
	}
	public List<OrderDto> selectOrderList(int member_id) {
		logger.info("실행");
		List<OrderDto> list = sst.selectList("orders.selectOrderList", member_id);		
		return list;
	}

	

}
