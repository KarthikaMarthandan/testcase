package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User 
{
	@Id
	@GeneratedValue
	private int userId;
	
	@Column
	private String userName;
	@Column
	private String userEmailId;
	@Column
	private String userPassword;
	@Column
	private String userPhoneno;
	
	public User()
	{
		System.out.println("BAG SHOWROOM");
	}
	
	public int getUserId() 
	{
		return userId;
	}
	public void setUserId(int userId) 
	{
		this.userId = userId;
	}
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getUserEmailId() 
	{
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) 
	{
		this.userEmailId = userEmailId;
	}
	public String getUserPassword() 
	{
		return userPassword;
	}
	public void setUserPassword(String userPassword) 
	{
		this.userPassword = userPassword;
	}
	public String getUserPhoneno() 
	{
		return userPhoneno;
	}
	public void setUserPhoneno(String userPhoneno) 
	{
		this.userPhoneno = userPhoneno;
	}
}


