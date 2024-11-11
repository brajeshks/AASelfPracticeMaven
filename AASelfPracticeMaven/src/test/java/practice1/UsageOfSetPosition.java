package practice1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetPosition {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);

		Dimension targetwindowsize = new Dimension(200, 300);
		driver.manage().window().setSize(targetwindowsize);
		Thread.sleep(3000);

		Point targetwindowposition = new Point(150, 200);
		driver.manage().window().setPosition(targetwindowposition);
	}
}
