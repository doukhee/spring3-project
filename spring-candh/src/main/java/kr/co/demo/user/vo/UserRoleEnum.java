package kr.co.demo.user.vo;

public enum UserRoleEnum {
	
	ADMIN("admin"), MANAGER("manager"), CUSTOMER("customer");
	
	String roleName;
	
	private UserRoleEnum() {
		// TODO Auto-generated constructor stub
		this.roleName = "customer";
	}
	
	private UserRoleEnum(String role) {
		// TODO Auto-generated constructor stub
		this.roleName = role;
		
	}

	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(UserRoleEnum role) {
		this.roleName = role.getRoleName();
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	

}
