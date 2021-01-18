package com.mycompany.teamproject.controller;

import java.io.File;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.teamproject.dto.UserDto;

@Service
public class UsersService {
	private static final Logger logger=LoggerFactory.getLogger(UsersService.class);
	
	
	
	public void sign_up_success(UserDto userDto) {
		//문자파트 정보얻기
		String uemail = userDto.getUemail();
		String upassword = userDto.getUpassword();
		String uname = userDto.getUname();
		String usex = userDto.getUsex();
		String uagree_e1 = userDto.getUagree_e1();
		String uagree_e2 = userDto.getUagree_e2();
		String uagree_o1 = userDto.getUagree_o1();
		String uagree_o2 = userDto.getUagree_o2();
		
		
		logger.info("uemail: "+uemail);
		logger.info("upassword: "+upassword);
		logger.info("uname: "+uname);
		logger.info("usex: "+usex);
		logger.info("uagree_o2: "+uagree_e1);
		logger.info("uagree_o2: "+uagree_e2);
		logger.info("uagree_o2: "+uagree_o1);
		logger.info("uagree_o2: "+uagree_o2);		
		
		//파일파트 정보얻기
		MultipartFile uphoto= userDto.getUphoto();
		if(!uphoto.isEmpty()) {
			String originalFileName = uphoto.getOriginalFilename();
			String contentType = uphoto.getContentType();
			long size = uphoto.getSize();
			logger.info("originalFileName: "+originalFileName);
			logger.info("contentType: "+contentType);
			logger.info("size: "+size);
			
			//파일 저장 이름 및 경로
			String saveDirPath = "D:/MyWorkspace/uploadfiles/";
			String fileName = new Date().getTime() + "-" + originalFileName;
			String filePath = saveDirPath + fileName;
			File file = new File(filePath);
			try {
				uphoto.transferTo(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
