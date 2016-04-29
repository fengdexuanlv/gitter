package com.jd.denglu.modal;

public class Users {

	private int userId;
	private String cellphone;
	private String password;
	private String sessionId;
	private boolean cellphoneAuth;
	private boolean idcardAuth;
	private String nickName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public boolean isCellphoneAuth() {
		return cellphoneAuth;
	}
	public void setCellphoneAuth(boolean cellphoneAuth) {
		this.cellphoneAuth = cellphoneAuth;
	}
	public boolean isIdcardAuth() {
		return idcardAuth;
	}
	public void setIdcardAuth(boolean idcardAuth) {
		this.idcardAuth = idcardAuth;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
}
