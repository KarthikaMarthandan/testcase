package com.niit.test;
import static org.junit.Assert.*;
import java.util.List;


import javax.transaction.Transactional;

//import javax.transaction.Transactional;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;

public class SupplierUnitTest 
{
	static SupplierDAO supplierDAO;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	}
	
	@Transactional
	@Test
	public void addSupplierTest()
	{
		Supplier supplier=new Supplier();
		supplier.setsupplierId(3);
		supplier.setsupplierName("Karthii");
		supplier.setSupplierDesc("BAGS R MORE FLEXIBLE");
		assertTrue("Problem in Supplier Insertion",supplierDAO.addSupplier(supplier));
	}
	
	/*@Ignore
	@Test
	public void getSupplierTest()
	{
		assertNotNull("Problem in get Category",categoryDAO.getCategory(1));
	}
	
	/*@Ignore
	@Test
	public void deleteSupplierTest()
	{
		Supplier supplier=supplierDAO.getSupplier(2);
		assertTrue("Problem in Deletion:",supplierDAO.deletesupplier());
	}
*/
  @Transactional
  @Ignore
	@Test
	public void updateSupplierTest()
	{
		Supplier supplier=supplierDAO.getSupplier(1);
		supplier.setsupplierName("SKY BAG");
		assertTrue("Problem in Updation",supplierDAO.updateSupplier(supplier));
	}
	
  /*@Ignore
	@Test
	public void listSupplierTest()
	{
		List<Supplier> listSupplier=supplierDAO.getSupplier();
		assertNotNull("No Supplier",listSupplier);
		for(Supplier supplier:listSupplier)
		{
			System.out.print(supplier.getsupplierId()+":::");
			System.out.print(supplier.getSupplierName()+":::");
			System.out.println(supplier.getSupplierDesc());
		}
	}
	*/
}

