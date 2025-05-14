package serosoft;

import org.testng.annotations.Test;

public class Annotation {
	@Test(priority = 2)
	public void Test1() {
		System.out.println("Test1 is executed");
	}
	@Test(priority = 4,enabled = false)
	public void Test2() {
		System.out.println("Test2 is executed");
	}
	@Test(priority = 3)
	public void Test3() {
		System.out.println("Test3 is executed");
	}
	@Test(priority = 1,testName = "Pallavi")
	public void TestLogin() {
		System.out.println("LoginTest is executed");
	}

}
