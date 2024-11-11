package samplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleClass {
	
	@Test
	public void sampleTest() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
	}
}
