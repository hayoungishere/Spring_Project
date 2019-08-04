package com.bigdata.spring.member.service;

import java.util.List;

import com.bigdata.spring.member.vo.StoreManageVO;

public interface StoreManageServiceImpl {

	public List<StoreManageVO> managerList();
	public String checkIdPwd(String id, String pwd);
	
}
