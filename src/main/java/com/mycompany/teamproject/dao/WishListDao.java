package com.mycompany.teamproject.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mycompany.teamproject.dto.WishListDto;

@Repository
public class WishListDao {
	private static final Logger logger=LoggerFactory.getLogger(WishListDao.class);
	
	@Resource
	private SqlSessionTemplate sst;

	public List<WishListDto> selectAll() {
		logger.info("실행");
		List<WishListDto> wishlistList = sst.selectList("wishes.selectAll");		
		return wishlistList;
	}
	
		public WishListDto selectwish(int member_id) {
			logger.info("실행");
			WishListDto wish = sst.selectOne("wishes.selectByPk", member_id);	
			return wish;
		}
}