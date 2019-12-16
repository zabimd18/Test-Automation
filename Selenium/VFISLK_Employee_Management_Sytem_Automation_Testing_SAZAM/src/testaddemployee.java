import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class testaddemployee {

	public static void main(String[] args) throws  Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8090/Employee_Management_System/Login.jsp");
		if((driver.getTitle().equals("Login module")))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login unsuccessful");
	
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\AddEmployee01.png"));
		}
		driver.findElement(By.id("userName")).sendKeys("slk");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("slk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[3]/input")).click();
		if((driver.getTitle().equals("Home")))
		{
			System.out.println("Home displayed");
		}
		else
		{
			System.out.println("Home page not displayed");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\AddEmployee02.png"));
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("empID")).sendKeys("300367");
		Thread.sleep(2000);
		driver.findElement(By.name("empName")).sendKeys("Sarvi");
		Thread.sleep(2000);
		driver.findElement(By.name("empDept")).sendKeys("Testing(VFISLK)");
		Thread.sleep(2000);
		driver.findElement(By.name("empSal")).sendKeys("200000");
		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(source, new File("E:\\AddEmployee03.png"));
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/input[5]")).click();
		if((driver.getTitle().equals("View Employee")))
		{
			System.out.println("employee added");
			
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			Files.copy(source1, new File("E:\\AddEmployee04.png"));
		}
		else
		{
			System.out.println("employee not added");
			
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			Files.copy(source1, new File("E:\\AddEmployee04.png"));

		}
		Thread.sleep(2000);
				
		driver.close();
	}

}
