package com.mycompany.teamproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.WishDto;

@Repository
public class WishDao {
	private static final Logger logger=LoggerFactory.getLogger(WishDao.class);
	
	@Resource
	private SqlSessionTemplate sst;

	public List<WishDto> selectAll() {
		logger.info("실행");
		List<WishDto> wishList = sst.selectList("wishes.selectAll");		
		return wishList;
	}
	
		public WishDto selectwish(int member_id) {
			logger.info("실행");
			WishDto wish = sst.selectOne("wishes.selectByPk", member_id);	
			return wish;
		}
}
