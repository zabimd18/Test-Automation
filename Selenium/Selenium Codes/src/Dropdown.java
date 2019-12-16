import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.xpath("//*[text()='Create a new account']")).click();
	driver.findElement(By.className("nomargin")).click();
	Select select=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
	select.selectByIndex(2);
	Thread.sleep(2000);
	select.selectByValue("05");
	Thread.sleep(2000);
	select.selectByVisibleText("NOV");
	driver.findElement(By.xpath("//input[@value='f']")).click();
	driver.close();
	}

}
