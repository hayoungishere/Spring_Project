package com.bigdata.spring.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bigdata.spring.member.dao.MembershipDAO;
import com.bigdata.spring.member.vo.MembershipVO;

@Service
public class MembershipService implements MemberShipServiceImpl {

	@Inject
	MembershipDAO membershipDAO;
	
	@Override
	public List<MembershipVO> membershipList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMember(MembershipVO mvo) {
		// TODO Auto-generated method stub

	}

	@Override
	public MembershipVO viewMembership(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMembership(MembershipVO mvo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMember(MembershipVO mvo) {
		// TODO Auto-generated method stub

	}

	@Override
	public String checkIdPwd(String id, String pwd) {
		// TODO Auto-generated method stub
		
		return membershipDAO.checkIdPwd(id, pwd);

	}

}
