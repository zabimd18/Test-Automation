import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class View_Employee {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8090/Employee_Management_System/Login.jsp");
		driver.findElement(By.id("userName")).sendKeys("slk");
		driver.findElement(By.id("password")).sendKeys("slk");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		if(driver.getTitle().equals("Home"))
		{
			System.out.println("Home Page Displayed");
		}
		else
		{
			System.out.println("Home Page Not Displayed");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\ViewEmployee01.png"));
		}
		driver.findElement(By.xpath("//div[@id='collapsibleNavbar']/ul/li[3]")).click();
		Thread.sleep(2000);
		if(driver.getTitle().equals("View Employee"))
		{
			System.out.println("View Emplopyee Page Displayed");
			System.out.println("Home Page Not Displayed");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\ViewEmployee02.png"));
		}
		else
		{
			System.out.println("View Emplopyee Page Not Displayed");
			System.out.println("Home Page Not Displayed");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\ViewEmployee02.png"));
		}
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[5]")).click();
		Thread.sleep(2000);
		if(driver.getTitle().equals("Edit Employee"))
		{
			System.out.println("Edit Employee Page Displayed");
			System.out.println("Home Page Not Displayed");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\ViewEmployee03.png"));
		}
		else
		{
			System.out.println("Edit Employee Page Not Displayed");
			System.out.println("Home Page Not Displayed");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\ViewEmployee03=.png"));
		}
		driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		try
		{driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[6]/button")).click();
			System.out.println("Data Delteed");
			System.out.println("Home Page Not Displayed");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\ViewEmployee04.png"));
		}
		catch(Exception e)
		{
			System.out.println("Data Not Deleted");
			System.out.println("Home Page Not Displayed");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			Files.copy(source, new File("E:\\ViewEmployee04.png"));
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/div/ul/li[5]/a")).click();
		if(driver.getTitle().equals("Login Module"))
		{
			System.out.println("login Page Displayed");
		}
		else
		{
			System.out.println("login Page Not Displayed");
		}
		driver.quit();
	}

}
