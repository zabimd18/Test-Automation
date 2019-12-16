import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Login {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8090/Employee_Management_System/Login.jsp");
		driver.findElement(By.id("userName")).sendKeys("slk");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("slk");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(source, new File("E:\\Login01.png"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		if(driver.getTitle().equals("Home"))
		{
			System.out.println("Login Successful");
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			Files.copy(source1, new File("E:\\Login02.png"));
		}
		else
		{
			System.out.println("Login failed");
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			Files.copy(source1, new File("E:\\Login02.png"));
		}
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='collapsibleNavbar']/ul/li[5]")).click();
		Thread.sleep(3000);
		if(driver.getTitle().equals("Login Module"))
		{
			System.out.println("Logout Successful");
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			Files.copy(source1, new File("E:\\Login03.png"));
		}
		else
		{
			System.out.println("Logout failed");
			TakesScreenshot ts1 = (TakesScreenshot)driver;
			File source1 = ts1.getScreenshotAs(OutputType.FILE);
			Files.copy(source1, new File("E:\\Login03.png"));
		}
		
		driver.findElement(By.id("userName")).sendKeys("zzzz");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("1111");
		Thread.sleep(3000);
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		Files.copy(source1, new File("E:\\Login04.png"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		if(driver.getTitle().equals("Login Failed"))
		{
			System.out.println("Error page displayed");
			TakesScreenshot ts11 = (TakesScreenshot)driver;
			File source11 = ts11.getScreenshotAs(OutputType.FILE);
			Files.copy(source11, new File("E:\\Login05.png"));
		}
		else
		{
			System.out.println("Error page was not displayed");
			TakesScreenshot ts11 = (TakesScreenshot)driver;
			File source11 = ts11.getScreenshotAs(OutputType.FILE);
			Files.copy(source11, new File("E:\\Login05.png"));
		}
		
		driver.findElement(By.linkText("Click Here to try again")).click();
		Thread.sleep(3000);
		if(driver.getTitle().equals("Login Module"))
		{
			System.out.println("Login page displayed");
			TakesScreenshot ts11 = (TakesScreenshot)driver;
			File source11 = ts11.getScreenshotAs(OutputType.FILE);
			Files.copy(source11, new File("E:\\Login06.png"));
		}
		else
		{
			System.out.println("Login page was not displayed");
			TakesScreenshot ts11 = (TakesScreenshot)driver;
			File source11 = ts11.getScreenshotAs(OutputType.FILE);
			Files.copy(source11, new File("E:\\Login06.png"));
		}
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[5]/a")).click();
		if(driver.getTitle().equals("Sign Up"))
		{
			System.out.println("Sign Up page displayed");
			TakesScreenshot ts11 = (TakesScreenshot)driver;
			File source11 = ts11.getScreenshotAs(OutputType.FILE);
			Files.copy(source11, new File("E:\\Login07.png"));
		}
		else
		{
			System.out.println("Sign Up page was not displayed");
			TakesScreenshot ts11 = (TakesScreenshot)driver;
			File source11 = ts11.getScreenshotAs(OutputType.FILE);
			Files.copy(source11, new File("E:\\Login07.png"));
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
