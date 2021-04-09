package kr.co.demo.user.dao;

import java.util.List;

import kr.co.demo.user.vo.UserLoginTimeVO;
import kr.co.demo.user.vo.UserRoleVO;
import kr.co.demo.user.vo.UserVO;
import kr.co.demo.util.Criteria;

public interface UserDao {

	/**
	 * Sign In User 
	 * @param user
	 * @return boolean
	 */
	public boolean InsertUser(UserVO user);
	
	/**
	 * Insert User Role Default CUSTOMER
	 * @param email
	 * @return boolean 
	 */
	public boolean InsertRuleDefault(String email);
	
	/**
	 * User Login Insert Login Time
	 * @param email
	 * @return boolean
	 */
	public boolean UserLoginTime(String email);
	
	/**
	 * Login Find User By Email 
	 * @param user
	 * @return user
	 */
	public UserVO loginUser(UserVO user);
	
	/**
	 * Find User Using Find User
	 * @param user
	 * @return
	 */
	public UserVO findByUserVO(UserVO user);
	
	/**
	 * Find User Using Find User Email String
	 * @param email
	 * @return
	 */
	public UserVO findByUserEmail(String email);
	
	/**
	 * Find User Using Find User Get Role Add
	 * @param user
	 * @return UserVo add UserRoleVO
	 */
	public UserVO findByUserAndRole(UserVO user);
	
	/**
	 * Get User Info All
	 * @param user
	 * @return UserVO add UserRoleVO, UserDetailVO, UserLoginTimeVO
	 */
	public UserVO UserInfo(String user);
	public UserVO UserInfo(UserVO user);
	
	/**
	 * Update User Using email and idx
	 * @param user
	 * @return
	 */
	public boolean UpdateUser(UserVO user);
	
	/**
	 * Delete User user function
	 * @param user
	 * @return boolean
	 */
	public boolean UserDelete(UserVO user);
	
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public boolean InsertLoginTime(UserVO user);

	
	/**
	 * 
	 * Admin User Dao
	 * 
	 */
	
	/** 
	 * User Role Add
	 * @param role
	 * @return boolean
	 */
	public boolean InsertUserRole(UserRoleVO role);
	
	/**
	 * Update User Admin
	 * @param user
	 * @return boolean
	 */
	public boolean UpdateUserAll(UserVO user);
	
	/**
	 * User Role Update Using UserRoleVO
	 * @param role
	 * @return boolean
	 */
	public boolean UpdateUserRole(UserRoleVO role);
	
	/**
	 * User Login Time All List 
	 * @param user
	 * @return List<UserLoginTimeVO>
	 */
	public List<UserLoginTimeVO> getLoginTimesbyUserVO(UserVO user);
	
	/**
	 * Get User Info All 
	 * @param user
	 * @return UserVO
	 */
	public UserVO userInfoAll(UserVO user);
	public UserLoginTimeVO getLastLoginTime(UserVO user);

	/**
	 * User Delete Using VO
	 * @param email
	 * @return boolean
	 */
	public boolean UserDeleteAdmin(UserVO email);

	/**
	 * User Delete Multiple
	 * @param users
	 * @param user_length
	 * @return boolean
	 */
	public boolean UserDeleteList(List<UserVO> users, int user_length);

	/**
	 * Paging User List Admin Page Show List
	 * @param cri
	 * @return List<UserVO>
	 */
	public List<UserVO> getPaging(Criteria cri);
	
	/**
	 * Get User Paging List Count 
	 * @param cri
	 * @return integer
	 */
	public int getTotalCount(Criteria cri);
}
