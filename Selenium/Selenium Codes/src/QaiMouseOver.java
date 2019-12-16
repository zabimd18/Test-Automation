import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QaiMouseOver {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qaiglobalinstitute.com/");
		WebElement acc=driver.findElement(By.id("menu-item-14"));
		WebElement acc1=driver.findElement(By.id("menu-item-22520"));
		
		Actions act=new Actions(driver);
		act.moveToElement(acc).moveToElement(acc1).build().perform();
		driver.findElement(By.id("menu-item-35891")).click();
	}

}
