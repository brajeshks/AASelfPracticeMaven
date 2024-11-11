package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfreLoad {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();       /* String p = driver.getPageSource();
        System.out.println("pageSourse: "+p);  */
		
		String url = driver.getCurrentUrl();
		System.out.println("current URL: "+url );
		
	}
}
