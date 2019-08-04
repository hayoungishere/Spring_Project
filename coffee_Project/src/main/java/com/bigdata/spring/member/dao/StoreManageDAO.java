package com.bigdata.spring.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bigdata.spring.member.vo.StoreManageVO;

@Repository
public class StoreManageDAO implements StoreManageDAOImpl {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<StoreManageVO> managerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkIdPwd(String id, String pwd) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("pwd", pwd);
		StoreManageVO smvo=sqlSession.selectOne("manager.managerOne", map);
		System.out.println("this is checkIdPwd : "+smvo.toString());
		return id;
	}

}
