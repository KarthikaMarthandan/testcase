package com.niit.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier
{
	@Id
	@GeneratedValue
	private int supplierId;
	
	private String supplierName;
	private String supplierDesc;
	
	public int getsupplierId() 
	{
		return supplierId;
	}
	public void setsupplierId(int supplierId) 
	{
		this.supplierId = supplierId;
	}
	public String getsupplierName() 
	{
		return supplierName;
	}
	public void setsupplierName(String supplierName) 
	{
		this.supplierName = supplierName;
	}
	public String getSupplierDesc() 
	{
		return supplierDesc;
	}
	public void setSupplierDesc(String supplierDesc) 
	{
		this.supplierDesc = supplierDesc;
	}
}