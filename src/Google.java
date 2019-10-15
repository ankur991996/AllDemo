import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");

		WebElement id = driver.findElement(By.id("identifierId"));
		id.sendKeys("pankur862");
		driver.findElement(By.id("identifierNext")).click();
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Alia bhat", Keys.ENTER);
		/*
		 * driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER);
		 * Thread.sleep(2000); WebElement ele = driver .findElement(By.
		 * xpath("//div[@class=\"kno-ecr-pt kno-fb-ctx PZPZlf gsmt\"]/span[contains(.,'Java')]"
		 * )); Actions a = new Actions(driver); a.doubleClick(ele).perform();
		 * a.dragAndDropBy(source, xOffset, yOffset)
		 */

		/*
		 * driver.get("https://jqueryui.com/droppable/"); WebElement frame =
		 * driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		 * driver.switchTo().frame(frame); WebElement s =
		 * driver.findElement(By.id("draggable")); WebElement t =
		 * driver.findElement(By.id("droppable")); Actions a = new Actions(driver); //
		 * a.dragAndDropBy(s, 120, 0).build().perform(); a.dragAndDrop(s, t).perform();
		 * ;
		 */
	}
}
