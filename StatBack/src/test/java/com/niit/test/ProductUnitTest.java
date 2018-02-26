package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;


public class ProductUnitTest {
	static ProductDAO productDAO;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		productDAO=(ProductDAO)context.getBean("productDAO");
	}
	

	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductId(1);
		product.setSupplierId(1);
		product.setCategoryId(1);
		product.setPrice(789);
		product.setStock(20);
		product.setProductName("Sling Bags");
		product.setProdDesc("flexible to keep more books");
		assertTrue("Problem in Supplier Insertion",productDAO.addProduct(product));
	}
	
	@Ignore
	@Test
	public void getProductTest()
	{
		Product product=productDAO.getProduct(1);
		assertNotNull("Problem in get Product",productDAO.getProduct(1));
	}
	
	@Ignore
	@Test
	public void deleteProductTest()
	{
		Product product=productDAO.getProduct(1);
		assertTrue("Problem in Deletion:",productDAO.deleteProduct(product));
	}

    
	@Test
	public void updateProductTest()
	{
		Product product=productDAO.getProduct(1);
		product.setPrice(999);
		product.setStock(25);
		product.setProductName("LAP TOP BAGS");
		product.setProdDesc("flexible to keep LAPTOP & BOOKS 15 inch");
		assertTrue("Problem in Updation",productDAO.updateProduct(product));
	}
	@Ignore
	@Test
	public void listProductTest()
	{
		List<Product> listProducts=productDAO.getProducts();
		assertNotNull("No Product",listProducts);
		for(Product product:listProducts)
		{
			System.out.print(product.getProductId()+":::");
			System.out.print(product.getProductName()+":::");
		}
	}
}

