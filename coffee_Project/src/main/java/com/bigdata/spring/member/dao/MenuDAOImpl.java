package com.bigdata.spring.member.dao;

import java.util.List;

import com.bigdata.spring.member.vo.MenuVO;

public interface MenuDAOImpl {
	public List<MenuVO> menuList(List<Integer> list);
	public MenuVO viewMenu(String name);
}