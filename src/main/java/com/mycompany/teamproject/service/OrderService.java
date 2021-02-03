package com.mycompany.teamproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.teamproject.Exception.AccountInsufficientException;
import com.mycompany.teamproject.dao.MemberDao;
import com.mycompany.teamproject.dao.OrderDao;
import com.mycompany.teamproject.dao.PartnerDao;
import com.mycompany.teamproject.dto.MemberDto;
import com.mycompany.teamproject.dto.OrderDto;
import com.mycompany.teamproject.dto.PartnerDto;

@Service
public class OrderService {
	private static final Logger logger=LoggerFactory.getLogger(OrderService.class);
	
	@Resource
	private OrderDao orderDao;
	@Resource
	private MemberDao memberDao;
	@Resource
	private PartnerDao partnerDao;
	

	public void orderProcess(OrderDto order) {
		logger.info("실행");		
		orderDao.insertOrder(order);
	}
	public List<OrderDto> getOrderList(int member_id) {
		logger.info("실행");
		List<OrderDto> list = orderDao.selectOrderList(member_id);		
		return list;
	}
	@Transactional
	public int setAccount(int ocost, int member_id, int partner_id) throws AccountInsufficientException {
		MemberDto member = new MemberDto();
		PartnerDto partner = new PartnerDto();
		member.setMember_id(member_id);
		partner.setPartner_id(partner_id);
		member.setMaccount(ocost);
		partner.setPaccount(ocost);
		int rowsM = memberDao.MaccountMupdate(member);
		int rowsP = partnerDao.setPaccountP(partner);
		if(rowsM!=1 || rowsP!=1) {
			throw new AccountInsufficientException("noMoney");
		} else {
			return 1;
		}
	}

	

		
}

	
	
	

