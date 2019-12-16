import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Search {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8090/Employee_Management_System/Login.jsp");
		Thread.sleep(4000);
		driver.findElement(By.id("userName")).sendKeys("slk");
		driver.findElement(By.id("password")).sendKeys("slk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Login']")).click();
		Thread.sleep(4000);
		if(driver.getTitle().equals("Home"))
		{
			System.out.println("Home page displayed");
		}
		else
		{
			System.out.println("Home page not displayed");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\SearchEmployee01.png"));
		}
		driver.findElement(By.xpath("//div[@id='collapsibleNavbar']")).click();
		Thread.sleep(4000);
		if(driver.getTitle().equals("Search Employee"))
		{
			System.out.println("Search Employee page displayed");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\SearchEmployee02.png"));
		}
		else
		{
			System.out.println("Search Employee page not displayed");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\SearchEmployee02.png"));
		}
		driver.findElement(By.name("empID")).sendKeys("300366");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(source, new File("E:\\SearchEmployee03.png"));
		driver.findElement(By.xpath("//*[@class='btn btn-dark']")).submit();
		Thread.sleep(4000);
		if(driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]")).getText().equals("300366"))
{
	System.out.println("Search result displayed");
	TakesScreenshot ts1 = (TakesScreenshot)driver;
	File source1 = ts1.getScreenshotAs(OutputType.FILE);
	Files.copy(source1, new File("E:\\SearchEmployee04.png"));
}
else
{
	System.out.println("Search result not displayed");
	TakesScreenshot ts1 = (TakesScreenshot)driver;
	File source1 = ts1.getScreenshotAs(OutputType.FILE);
	Files.copy(source1, new File("E:\\SearchEmployee05.png"));
}
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
		Thread.sleep(4000);
		if(driver.getTitle().equals("Edit Employee"))
		{
			System.out.println("Employee details are edited");
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			Files.copy(source1, new File("E:\\SearchEmployee06.png"));
		}
		else
		{
			System.out.println("Employee details are not edited");
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			Files.copy(source1, new File("E:\\SearchEmployee06.png"));
		}
		driver.findElement(By.xpath("//*[@class='btn btn-block btn-success send-button tx-tfm']")).click();
		if(driver.getTitle().equals("View Employee"))
		{
			System.out.println("Employee details are saved");
		}
		else
		{
			System.out.println("Employee details are not saved");
		}
		Thread.sleep(4000);
		try {
			driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		System.out.println("Data is deleted");
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		Files.copy(source1, new File("E:\\SearchEmployee07.png"));
		}
		catch(Exception e)
		{
			System.out.println("Data is not deleted");
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			Files.copy(source1, new File("E:\\SearchEmployee07.png"));
		}
		Thread.sleep(4000);
		driver.quit();
	}
}
