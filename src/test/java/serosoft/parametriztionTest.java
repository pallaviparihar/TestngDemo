package serosoft;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametriztionTest {
	@Parameters("URL")
	@Test
	public void Fillform(@Optional("https://google.com")String URL) {
		System.out.println("The url is"+ URL);
		
	}
	

}
