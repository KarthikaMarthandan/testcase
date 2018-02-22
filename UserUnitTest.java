
	package com.niit.test;
	import static org.junit.Assert.*;
	import java.util.List;
	import org.junit.BeforeClass;
	import org.junit.Ignore;
	import org.junit.Test;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	import com.niit.dao.UserDAO;
	import com.niit.model.User;

	public class UserUnitTest 
	{
		static UserDAO userDAO;

		@BeforeClass
		public static void executeFirst()
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.niit");
			context.refresh();
			
			userDAO=(UserDAO)context.getBean("userDAO");
		}
		
		@Test
		public void addUserTest()
		{
			User user=new User();
			user.setUserId(1);
			user.setUserName("KARTHIKA");
			user.setUserEmailId("abi.marthandan1224@gmail.com");
			user.setUserPassword("4321");
			user.setUserPhoneno("9087654321");
			assertTrue("Problem in User Insertion",userDAO.addUser(user));
		}
		
		@Ignore
		@Test
		public void getUserTest()
		{
			assertNotNull("Problem in get User",userDAO.getUser(2));
		}
		
		@Ignore
		@Test
		public void deleteUserTest()
		{
			User user=userDAO.getUser(2);
			assertTrue("Problem in Deletion:",userDAO.deleteUser(user));
		}

		@Test
		public void updateUserTest()
		{
			User user=userDAO.getUser(1);
			user.setUserName("L Sofa Model");
			assertTrue("Problem in Updation",userDAO.updateUser(user));
		}
		
		@Test
		public void listUnitTest()
		{
			List<User> listUser=userDAO.getUser();
			assertNotNull("No User",listUser);
			
			for(User user:listUser)
			{
				System.out.print(user.getUserId()+":::");
				System.out.print(user.getUserName()+":::");
				System.out.println(user.getUserEmailId()+":::");
				System.out.println(user.getUserPassword()+":::");
				System.out.println(user.getUserPhoneno()+":::");
			}
		}
	}


