import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
public class Edit_Testing {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8090/Employee_Management_System/Login.jsp");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(source, new File("E:\\Edit01.png"));
		if((driver.getTitle().equals("Login Module")))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login unsuccessful");
		}
		driver.findElement(By.id("userName")).sendKeys("slk");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("slk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[3]/input")).click();
		Thread.sleep(2000);
		File source1=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(source1, new File("E:\\Edit02.png"));
		if((driver.getTitle().equals("Home")))
		{
			System.out.println("Home displayed");
		}
		else
		{
			System.out.println("Home page not displayed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[5]/button")).click();
		Thread.sleep(2000);
		File source11=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(source11, new File("E:\\Edit03.png"));
		if((driver.getTitle().equals("Edit")))
		{
			System.out.println("Edit page displayed");
		}
		else
		{
			System.out.println("Edit page not displayed");
		}
		driver.findElement(By.name("empDept")).clear();
		driver.findElement(By.name("empDept")).sendKeys("Testing(VFISLK)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button")).click();
		Thread.sleep(1000);
		File source111=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(source111, new File("E:\\Edit04.png"));
		if((driver.getTitle().equals("View Employee")))
		{
			System.out.println("Employee Updated");
		}
		else
		{
			System.out.println("Employee not added");
		}
		Thread.sleep(2000);
				
		driver.close();
	}

}
