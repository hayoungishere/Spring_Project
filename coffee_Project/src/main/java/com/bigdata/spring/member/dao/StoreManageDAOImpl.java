package com.bigdata.spring.member.dao;

import java.util.List;

import com.bigdata.spring.member.vo.StoreManageVO;

public interface StoreManageDAOImpl {
	public List<StoreManageVO> managerList();
	public String checkIdPwd(String id, String pwd);
}
