package com.bigdata.spring.member.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bigdata.spring.member.vo.MemberVO;

@Repository
public class MemberDAO implements MemberDAOImpl{

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<MemberVO> memberList() {
		// TODO Auto-generated method stub
		List<MemberVO> mlist=sqlSession.selectList("member.memberList");
											// namespace.id
				
		return mlist;
	}

	@Override
	public void insertMember(MemberVO mvo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO viewMember(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(MemberVO mvo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkIdPwd(String id, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}

}
