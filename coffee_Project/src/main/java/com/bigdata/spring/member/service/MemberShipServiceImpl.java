package com.bigdata.spring.member.service;

import java.util.List;

import com.bigdata.spring.member.vo.MembershipVO;

public interface MemberShipServiceImpl {

	public List<MembershipVO> membershipList();
	public void insertMember(MembershipVO mvo);
	public MembershipVO viewMembership(String name);
	public void deleteMembership(MembershipVO mvo);
	public void updateMember(MembershipVO mvo);
	public String checkIdPwd(String id, String pwd);
	
	
}
