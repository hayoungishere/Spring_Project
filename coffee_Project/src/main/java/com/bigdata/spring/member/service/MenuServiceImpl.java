package com.bigdata.spring.member.service;

import java.util.List;

import com.bigdata.spring.member.vo.MenuVO;
import com.bigdata.spring.member.vo.StoreManageVO;

public interface MenuServiceImpl {
	public List<MenuVO> MenuList(List<Integer> menuName);
}
