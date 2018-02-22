package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category 
{
	@Id
	@GeneratedValue
	private int categoryId;
	
	@Column
	private String categoryName;
	@Column
	private String cateogryDesc;
	
	public Category()
	{
		System.out.println("cat object");
	}
	
	public int getCategoryId() 
	{
		return categoryId;
	}
	public void setCategoryId(int categoryId) 
	{
		this.categoryId = categoryId;
	}
	public String getCategoryName() 
	{
		return categoryName;
	}
	public void setCategoryName(String categoryName) 
	{
		this.categoryName = categoryName;
	}
	public String getCateogryDesc() 
	{
		return cateogryDesc;
	}
	public void setCateogryDesc(String cateogryDesc) 
	{
		this.cateogryDesc = cateogryDesc;
	}
}


