package com.mycompany.teamproject.controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {
		private static final Logger logger=
				LoggerFactory.getLogger(MainController.class);


		// http://.../teamproject/main 생략됨
		@RequestMapping("/content")
		public String content() {
			logger.info("실행");
			return "main/content";
		}
		
		@Resource
		private DataSource dataSource;
		
		
		
		@GetMapping("/conntest")
		public String conntest() {
			try {
				//커넥션 풀에서 커넥션 대여
				Connection conn= dataSource.getConnection();
				logger.info("연결성공");
				/*Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select nation_id, nname, nimage from nations where nation_id=2");
				if(rs.next()) {
					logger.info(rs.getString("nname"));
				} else {
					logger.info("데이터 없음");
				}
				rs.close();*/
				/* stmt.executeUpdate("insert into nations values (2, 'a', 'b')");
				stmt.close();*/
				//대여한 커넥션 반납
				conn.close();
			} catch (SQLException e) {
				logger.info("연결실패");
				e.printStackTrace();
			}
			return "main/content";
		}
		

}
