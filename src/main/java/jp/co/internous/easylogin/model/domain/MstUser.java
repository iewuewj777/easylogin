package jp.co.internous.easylogin.model.domain;

public class MstUser {
	private int id;
	private String userName;
	private String password;
	private String fullName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsserName() {
		return userName;
	}
	public void setUsserName(String userName) {
		this.userName=userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getfullName() {
		return fullName;
	}
	public void setfullName(String fullName) {
		this.fullName=fullName;
	}
	
	
}
