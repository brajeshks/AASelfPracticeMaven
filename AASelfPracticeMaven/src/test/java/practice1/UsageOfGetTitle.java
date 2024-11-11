package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
		driver.manage().window().maximize();
		String webPageTitle = driver.getTitle();
		System.out.println("webPageTitle: "+webPageTitle);
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		String loginPageTitle = driver.getTitle();
		System.out.println("loginPageTitle: "+loginPageTitle);
		

	}

}
