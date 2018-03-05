package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.SupplierDAO;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;

public class SupplierController {

	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/Supplier")
	public String showSupplierPage(Model m)
	{
		Supplier product=new Supplier();
		m.addAttribute(supplier);
		m.addAttribute("catlist",this.getSupplier());
		return "Product";	
	}
	
	@RequestMapping(value="/InsertSupplier",method=RequestMethod.POST)
	public String addSupplier(@ModelAttribute("supplier")Supplier supplier,Model m,@RequestParam("pimage") MultipartFile filedet,BindingResult result)
	{
		Supplier product1=new Supplier();
		m.addAttribute(product1);
		supplierDAO.addSupplier(supplier);
		
		//===> Image Uploading
		String imagePath="C:\\S180255\\InteriorFrontend\\src\\main\\webapp\\resources\\images\\";
		imagePath=imagePath+String.valueOf(Supplier.getSupplierId())+".jpg";
		File image=new File(imagePath);
		
		if(!filedet.isEmpty())
		{
			
			try 
			{
				byte[] fileBuffer=filedet.getBytes();	
				FileOutputStream fos=new FileOutputStream(image);
				BufferedOutputStream bs=new BufferedOutputStream(fos);
				bs.write(fileBuffer);
				bs.close();
			} catch (Exception e)
			{
				System.out.println("Exception Arised:"+e);
				e.printStackTrace();
			}
			
		}
		else
		{
			System.out.println("Problem Occured in File Uploading");
		}
		
		//==>End of Image Uploading
		
		
		m.addAttribute("catlist",this.listCategories());
		return "Product";	
	}
	@RequestMapping(value="/SupplierPage",method=RequestMethod.GET)
	public String showSupplierPage(Model m)
	{
		List<Supplier> getSupplier=supplierDAO.getSupplier();
		m.addAttribute("getSupplier",getSupplier);
		return "SupplierPage";
	}
	
	@RequestMapping(value="/productDesc/{productId}",method=RequestMethod.GET)
	public String showProductDesc(@PathVariable("productId")int productId,Model m)
	{
		Product product=productDAO.getProduct(productId);
		String categoryName=categoryDAO.getCategory(product.getCategoryId()).getCategoryName();
		m.addAttribute("ProductInfo",product);
		m.addAttribute("categoryName",categoryName);
		return "ProductDesc";
	}
	public LinkedHashMap<Integer,String> listCategories()
	{
		List<Category> listCategories=categoryDAO.getCategories();
		LinkedHashMap<Integer,String> catlist=new LinkedHashMap<Integer,String>();
		for(Category category:listCategories)
		{
			catlist.put(category.getCategoryId(),category.getCategoryName());
		}
		return catlist;
	}
	

}


