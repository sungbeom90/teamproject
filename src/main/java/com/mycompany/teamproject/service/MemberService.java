package com.mycompany.teamproject.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.teamproject.controller.RegisterController;
import com.mycompany.teamproject.dao.MemberDao;

@Service
public class MemberService {
	private static final Logger logger=LoggerFactory.getLogger(RegisterController.class);
	
	@Resource
	private MemberDao memberdao;
	
	
}
