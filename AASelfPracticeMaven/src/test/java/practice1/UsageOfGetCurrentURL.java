package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentURL {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		String actualLoginPageUrl = driver.getCurrentUrl();
		System.out.println("actualLoginPageUrl: "+actualLoginPageUrl);
		
		String expectedLoginPageUrlString="https://demo.actitime.com/login.do";
		
		if(actualLoginPageUrl.contains("login.do"))
		{
			System.out.println("pass: the login page Url found correct and it is verified");
		}
		else {
			System.out.println("Fail: the login page Url found incorrect and it is verified");
		      }
		}

	}


