package kr.co.demo.user.vo;


import java.sql.Timestamp;

public class UserRoleVO {
	private Long idx;
	private String role;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	/** Relationship User */
	private UserVO user;

	public Long getIdx() {
		return idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public void setRole(UserRoleEnum role) {
		this.role = role.getRoleName();
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

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserRoleVO [idx=" + idx + ", role=" + role + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", user=" + user + "]";
	}
	
	
}
