import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("fossil watch men");
		Thread.sleep(1000);
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/span/div/div[1]/div/div/div/ol/li[1]/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hlb-ptc-btn-native")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("siNoCoverage-announce")).click();
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(1000);
		WebElement acc= driver.findElement(By.id("nav-link-accountList"));
		Actions act=new Actions(driver);
		act.moveToElement(acc).build().perform();
		driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a")).click();;
		
	}

}
