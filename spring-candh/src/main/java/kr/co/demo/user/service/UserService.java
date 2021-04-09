package kr.co.demo.user.service;

import java.util.List;

import kr.co.demo.user.vo.UserLoginTimeVO;
import kr.co.demo.user.vo.UserRoleVO;
import kr.co.demo.user.vo.UserVO;
import kr.co.demo.util.Criteria;

public interface UserService {
	
	public boolean RegisteUser(UserVO user);
	
	public boolean UpdateUser(UserVO user);
	
	public boolean DeleteUser(UserVO user);
	
	public UserVO InfoUser(UserVO user);
	
	public UserVO findUserByEmail(String email);
	
	public UserVO findUserByObj(UserVO user);
	
	public UserVO LoginUser(UserVO user);
	
	/**
	 * 
	 * Admin User Service Function
	 * 
	 */
	
	public List<UserVO> pagingUser(Criteria cri);
	
	public boolean RoleAdd(UserRoleVO role);
	
	public boolean UserRoleDelete(UserRoleVO role);
	
	public List<UserLoginTimeVO> getUserLoginTime(UserLoginTimeVO loginTime);
	
	public List<UserLoginTimeVO> getUserLoginTime(String email);
	
	public boolean UserDeleteList(List<UserVO> users, int length);
}
