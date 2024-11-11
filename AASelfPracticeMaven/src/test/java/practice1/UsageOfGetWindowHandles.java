package practice1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandles {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://nationalgeographic.com/");

		Set<String> allwindowsld = driver.getWindowHandles();
		int windowidcount = allwindowsld.size();
		System.out.println("windowidcount: " + windowidcount);

		for (String wid : allwindowsld) {
			System.out.println(wid);
		}
	}
}
