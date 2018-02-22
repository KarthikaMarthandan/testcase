package com.niit.test;

import static org.junit.Assert.assertTrue;

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
	
	@Transactional
	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductId(3);
		product.setProductName("Karthii");
		product.setProdDesc("BAGS R MORE FLEXIBLE");
		assertTrue("Problem in Supplier Insertion",productDAO.addProduct(product));
	}
	
	/*@Ignore
	@Test
	public void getProductTest()
	{
		assertNotNull("Problem in get Product",productDAO.getProduct(1));
	}
	
	/*@Ignore
	@Test
	public void deleteProductTest()
	{
		Product product=productDAO.getProduct(2);
		assertTrue("Problem in Deletion:",productDAO.deleteproduct());
	}
*/
  @Transactional
  @Ignore
	@Test
	public void updateProductTest()
	{
		Product product=productDAO.getProduct(1);
		product.setProductName("SKY BAG");
		assertTrue("Problem in Updation",productDAO.updateProduct(product));
	}
	
  /*@Ignore
	@Test
	public void listProductTest()
	{
		List<Product> listProduct=productDAO.getProduct();
		assertNotNull("No Product",listProduct);
		for(Product product:listProduct)
		{
			System.out.print(product.getproductId()+":::");
			System.out.print(product.getProductName()+":::");
			System.out.println(product.getProductDesc());
		}
	}
	*/
}

