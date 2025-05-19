package serosoft;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners({hooks.class})
public class listnersDemo {
	@Test(testName = "hooks test 2")
	public void Test2() {
		System.out.println("test2 is executed..");
	}
	@Test(testName = "Hooks test1")
	public void Test1() {
		System.out.println("test1 is executed..");

}
}
