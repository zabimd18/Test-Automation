import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[text()='Help']")).click();
		/*ArrayList<String> id=new ArrayList<>(driver.getWindowHandles());
		String tab=id.get(1);
		driver.switchTo().window(tab);*/ 
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		String tab=it.next();
		String tab1=it.next();
		driver.switchTo().window(tab1);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}