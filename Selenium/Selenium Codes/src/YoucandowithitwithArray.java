import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class YoucandowithitwithArray 
{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();				//Maximize Window
		driver.get("http://www.youcandealwithit.com/");		//Connect to website					
		String[] vfood= {"100","200","400"};
		String[] vcothing= {"100","200","50"};
		String[] vshelter= {"50","200","50"};
		String[] vincome= {"500","400","500"};
		WebElement acc=driver.findElement(By.xpath("//*[@id='siteNav']/li/a"));	//Locate to Browsers
		Actions act=new Actions(driver);										//Mousehover Action
		act.moveToElement(acc).build().perform();
		driver.findElement(By.xpath("//*[contains(text(),'Calculators & Resources')]")).click();	//Click on Calculator and Resourses
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/ul/li[1]/a")).click();				//Click on Calculators
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='indexNavList']/li[3]/a")).click();
		Thread.sleep(1000);
			for(int i=0;i<3;i++)
			{
				driver.findElement(By.id("food")).clear();
				driver.findElement(By.id("food")).sendKeys(vfood[i]);
				Thread.sleep(1000);
				driver.findElement(By.id("clothing")).clear();
				driver.findElement(By.id("clothing")).sendKeys(vcothing[i]);
				Thread.sleep(1000);
				driver.findElement(By.id("shelter")).clear();
				driver.findElement(By.id("shelter")).sendKeys(vshelter[i]);
				Thread.sleep(1000);
				driver.findElement(By.id("monthlyPay")).clear();
				driver.findElement(By.id("monthlyPay")).sendKeys(vincome[i]);
				Thread.sleep(4000);
				
				String monthlyexpenses=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
				String totalmontlyincome=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
				
				double monthlyexpenses1=Double.parseDouble(monthlyexpenses);
				double totalmontlyincome1=Double.parseDouble(totalmontlyincome);
				
				if(monthlyexpenses1==totalmontlyincome1)
				{
					System.out.println("You are Nither Good or Bad");
					TakesScreenshot ts = (TakesScreenshot)driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					Files.copy(source, new File("E:\\Screen"+i+".png"));
				}
				else
				{
					if(monthlyexpenses1>totalmontlyincome1)
					{
					System.out.println("Think before Sepnd");
					TakesScreenshot ts = (TakesScreenshot)driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					Files.copy(source, new File("E:\\Screen"+i+".png"));
					}
					else
					{
					System.out.println("You are a Good Saver");
					TakesScreenshot ts = (TakesScreenshot)driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					Files.copy(source, new File("E:\\Screen"+i+".png"));
					}
				}
				Thread.sleep(1000);
			}

		driver.quit();

	}

}
