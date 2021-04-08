package kr.co.demo.vo;

import java.sql.Date;

public class UserLoginTimeVO {
	private Long idx;
	private Date loginTime;
	
	/** Relationship User */
	private UserVO user;

	public Long getIdx() {
		return idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserLoginTimeVO [idx=" + idx + ", loginTime=" + loginTime + ", user=" + user + "]";
	}
	
	
}
