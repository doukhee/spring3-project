package kr.co.demo.user.vo;

import java.sql.Timestamp;

public class UserLoginTimeVO {
	private Long idx;
	private Timestamp login_time;
	
	/** Relationship User */
	private UserVO user;

	public Long getIdx() {
		return idx;
	}

	public void setIdx(Long idx) {
		this.idx = idx;
	}

	public Timestamp getLoginTime() {
		return login_time;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.login_time = loginTime;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserLoginTimeVO [idx=" + idx + ", loginTime=" + login_time + ", user=" + user + "]";
	}
	
	
}
