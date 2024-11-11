package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSwitchtoWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://nationalgeographic.com/");
		for (String wid : driver.getWindowHandles()) {
			String url = driver.switchTo().window(wid).getCurrentUrl();
			if (url.equals("https://www.facebook.com/")) {
				driver.close();
			} 
			else if (url.equals("https://nationalgeographic.com/")) 
			{
				//driver.close();
			}
		}
	}
}
