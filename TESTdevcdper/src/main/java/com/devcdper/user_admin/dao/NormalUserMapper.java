package com.devcdper.user_admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.devcdper.user_admin.domain.NormalUser;

@Mapper
public interface NormalUserMapper {
	
	
	//회원전체 조회
	public List<NormalUser> getNormalUserList();
	
	//회원가입
	public int addNormalUser(NormalUser normalUser);
	
	//회원 수정 조회
	public NormalUser getNormalInfoById(String userEmail);
	
	//회원 수정
	public int modifyNormalUser(NormalUser normalUser); 
	
	//회원 프로필 수정
	public int modifyProfilePicture(Object userEmail,String userProfilePicture);
	
	//회원 이메일 찾기
	public NormalUser normalForgotEmail(String userName, String userMoblie);
	
	//회원 패스워드 찾기
	public NormalUser normalForgotPassword(String userEmail, String userPasswordAnswer);
	
}

