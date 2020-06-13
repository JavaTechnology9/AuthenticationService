package com.javatechnology.model;

import java.io.Serializable;

public class UserOrganization implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String organizationId;
	 String userName;
	 
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	 
	 

}
