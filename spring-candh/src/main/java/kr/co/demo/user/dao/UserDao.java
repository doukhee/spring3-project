package kr.co.demo.user.dao;

import java.util.List;

import kr.co.demo.util.Criteria;
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
