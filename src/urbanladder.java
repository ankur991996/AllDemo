import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urbanladder {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"topnav bodytext\"]/li"));
		for (WebElement item : menu) {
			String name = item.getText();
			System.err.println(name);
			a.moveToElement(item).perform();
			Thread.sleep(1000);
			ScreenSTake.getScreenShot(driver, name);
			Thread.sleep(1000);
			List<WebElement> submenu = driver.findElements(
					By.xpath("//span[contains(.,'" + name + "')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
			for (WebElement subitem : submenu) {
				System.out.println(subitem.getText());
			}
		}
	}
}
