package com.bigdata.spring.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bigdata.spring.member.dao.MenuDAO;
import com.bigdata.spring.member.vo.MenuVO;
import com.bigdata.spring.member.vo.StoreManageVO;

@Service
public class MenuService implements MenuServiceImpl {
	
	@Inject
	MenuDAO menuDao;

	@Override
	public List<MenuVO> MenuList(List<Integer> menuName) {
		// TODO Auto-generated method stub
		return menuDao.menuList(menuName);
	}


}
