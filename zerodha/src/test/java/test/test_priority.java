package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_priority {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
		 
	}
	
	@Test
	public void testA() {
		System.out.println("testA");
	}
	
	@Test
	public void testB() {
		System.out.println("testB");
	}
	
	@Test
	public void testC() {
		System.out.println("testC");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}

}
	


