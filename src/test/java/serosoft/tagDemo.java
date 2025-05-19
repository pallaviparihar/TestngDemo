package serosoft;
import org.testng.annotations.*;

public class tagDemo {
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before test is executed..");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After test is executed..");
		
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before method is executed..");
		
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method is executed..");
		
	}
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suit is executed..");
		
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite is executed..");
		
	}
	@Test
	public void Test() {
		System.out.println("test is executed..");
		
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before class is executed..");
		
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("After class is executed..");
		
	}
	@Test
	public void Test2() {
		System.out.println("test2 is executed..");
	
	}
	
	

}
