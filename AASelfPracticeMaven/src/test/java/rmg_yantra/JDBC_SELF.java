package rmg_yantra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class JDBC_SELF {
	public static void main(String[] args) throws SQLException {
		
		// Create Project in GUI using Selenium code
		
	    String projectName = "Facebook_007";
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://106.51.90.215:8084");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("projectName");
		driver.findElement(By.name("createdBy")).sendKeys("BKS");
		
		WebElement status = driver.findElement(By.xpath("//label[text()='Project Status ']/following-sibling::select"));	
		Select select=new Select(status);
		select.selectByVisibleText("Created");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		Connection conn = null;

		boolean flag = false;
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);

		conn = DriverManager.getConnection("jdbc:mysql://106.51.90.215:3306/Projects", "root@%", "root");
		System.out.println("======DONE done done ==========");
		
		Statement state = conn.createStatement();
		ResultSet resultSet = state.executeQuery("select * from project");
		
		while(resultSet.next())
		{
			String actualProjectName = resultSet.getString(4);
			if(actualProjectName.equals(actualProjectName)) {
				flag=true;
				System.out.println(projectName + " is available = Pass");
			}
		}
		
		if (flag == false) {
			System.out.println(projectName + " is not available = Fail");
		}
		conn.close();
				
	}
}
