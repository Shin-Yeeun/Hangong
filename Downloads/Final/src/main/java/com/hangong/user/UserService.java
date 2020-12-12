package com.hangong.user;

import java.util.List;


public interface UserService {
	public int insertUser(UserVO vo);
	public int updateUser(UserVO vo);
	public UserVO getUser(int seq);
	public int deleteUser(int seq);
	public List<UserVO> getUserList() ;
}
