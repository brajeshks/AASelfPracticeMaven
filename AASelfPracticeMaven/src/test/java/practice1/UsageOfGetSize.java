package practice1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Dimension targetwindowsize = new Dimension(600, 300);
		driver.manage().window().setSize(targetwindowsize);
		Thread.sleep(3000);

		Point targetwindowposition = new Point(150, 200);
		driver.manage().window().setPosition(targetwindowposition);
		Thread.sleep(3000);
		
		Dimension windowSize=driver.manage().window().getSize();
		int windowWidth = windowSize.getWidth();
		System.out.println("windowWidth : "+windowWidth);
		
		int windowHeight = windowSize.getHeight();
		System.out.println("windowHeight: "+windowHeight);
		
		Point windowposition = driver.manage().window().getPosition();
		
		int windowStartX = windowposition.getX();
		System.out.println("windowStartX: "+windowStartX);
		
		int windowStartY = windowposition.getY();
		System.out.println("windowStartY: "+windowStartY);
		
	}
}
