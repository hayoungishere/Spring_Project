package com.bigdata.spring.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bigdata.spring.member.dao.StoreManageDAO;
import com.bigdata.spring.member.vo.StoreManageVO;

@Service
public class StoreManageService implements StoreManageServiceImpl {

	@Inject
	StoreManageDAO storeManageDAO;
	
	@Override
	public List<StoreManageVO> managerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkIdPwd(String id, String pwd) {
		// TODO Auto-generated method stub
		
		
		
		return storeManageDAO.checkIdPwd(id, pwd);
	}

}
