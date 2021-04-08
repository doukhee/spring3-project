package kr.co.demo.user.dao;

import java.util.List;

import kr.co.demo.vo.UserLoginTimeVO;
import kr.co.demo.vo.UserRoleVO;
import kr.co.demo.vo.UserVO;

public interface UserDao {

	public boolean InsertUser(UserVO user);
	public boolean InsertRuleDefault(String email);
	public boolean UserLoginTime(String email);
	public UserVO loginUser(UserVO user);
	public UserVO findByUserVO(UserVO user);
	public UserVO findByUserEmail(String email);
	public UserVO findByUserAndRole(UserVO user);
	public UserVO UserInfo(String user);
	public boolean UpdateUser(UserVO user);
	public boolean UserDelete(UserVO user);
	/** TODO */
	public boolean InsertUserRole(UserRoleVO role);
	public boolean InsertLoginTime(UserLoginTimeVO time);
	/**
	 * 
	 * Admin User Dao
	 * 
	 */
	
	public boolean UpdateUserAll(UserVO user);
	public boolean UpdateUserRole(UserRoleVO role);
	public List<UserLoginTimeVO> getLoginTimesbyUserVO(UserVO user);
	public UserVO userInfoAll(UserVO user);
	public UserLoginTimeVO getLastLoginTime(UserVO user);
	public boolean UserDeleteAdmin(UserVO email);
	public boolean UserDeleteList(List<UserVO> users, int user_length);
}
