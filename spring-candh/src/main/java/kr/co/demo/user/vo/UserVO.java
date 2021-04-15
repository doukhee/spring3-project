package kr.co.demo.user.vo;


import java.sql.Timestamp;
import java.util.List;

public class UserVO {
	private Long idx;
	private String email;
	private String password;
	private String name;
	private String phone;
	private String address1;
	private String address2;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	/** relationship User */
	private List<UserRoleVO> roles;
	private List<UserLoginTimeVO> loginTimes;
	private UserDetailVO detail;
	
	public Long getIdx() {
		return idx;
	}
	public void setIdx(Long idx) {
		this.idx = idx;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String paassword) {
		this.password = paassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<UserRoleVO> getRoles() {
		return roles;
	}
	public void setRoles(List<UserRoleVO> roles) {
		this.roles = roles;
	}
	public List<UserLoginTimeVO> getLoginTimes() {
		return loginTimes;
	}
	public void setLoginTimes(List<UserLoginTimeVO> loginTimes) {
		this.loginTimes = loginTimes;
	}
	public UserDetailVO getDetail() {
		return detail;
	}
	public void setDetail(UserDetailVO detail) {
		this.detail = detail;
	}
	
	@Override
	public String toString() {
		return "UserVO [idx=" + idx + ", email=" + email + ", paassword=" + password + ", name=" + name + ", phone="
				+ phone + ", address1=" + address1 + ", address2=" + address2 + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", roles=" + roles + ", loginTimes=" + loginTimes + ", detail=" + detail
				+ "]";
	}
	
	
}
