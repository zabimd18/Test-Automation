import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("draggable")).click();
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, dest).build().perform();
	}

}
