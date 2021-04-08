package kr.co.demo.vo;

import java.sql.Date;

public class UserRoleVO {
	private Long idx;
	private String role;
	private Date createdAt;
	private Date updatedAt;
	
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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
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
