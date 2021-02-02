package com.mycompany.teamproject.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.dao.OrderDao;
import com.mycompany.teamproject.dto.OrderDto;

@Service
public class OrderService {
	private static final Logger logger=LoggerFactory.getLogger(OrderService.class);
	
	@Resource
	private OrderDao orderDao;

	public void orderProcess(OrderDto order) {
		logger.info("실행");		
		orderDao.insertOrder(order);
		
		
	}

	

		
}

	
	
	

