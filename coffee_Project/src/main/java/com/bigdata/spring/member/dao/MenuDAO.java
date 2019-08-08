package com.bigdata.spring.member.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bigdata.spring.member.vo.MenuVO;

@Repository
public class MenuDAO implements MenuDAOImpl {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<MenuVO> menuList(List<Integer> menuName) {
		// TODO Auto-generated method stub
		List<MenuVO> res = new ArrayList<MenuVO>();
		
		
		for(int i=0; i<menuName.size(); i++) {
			Map<String, Integer> temp = new HashMap<String, Integer>();
			
			temp.put("idx", menuName.get(i));
			
			res.add(sqlSession.selectOne("menu.selectMenu",temp));
		}
		
		
		return res;
	}

	@Override
	public MenuVO viewMenu(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
