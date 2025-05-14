package serosoft;

import org.testng.annotations.Test;

public class groupDemo {
	@Test(groups = {"Regression","Smoke"})
	public void Test2() {
		System.out.println("Test2 is executed");
	}
	@Test(groups = {"os.windows"})
	public void Test3() {
		System.out.println("Test3 is executed");
	}
	@Test(groups= {"Regression","Smoke","sanity"},priority = 1)
	public void TestLogin() {
		System.out.println("LoginTest is executed");
	}

}
