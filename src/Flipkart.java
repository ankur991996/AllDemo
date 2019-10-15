import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		WebElement electronic = driver
				.findElement(By.xpath("//li[@class=\"Wbt_B2 _1YVU3_\"]/span[contains(.,'Electronics')]"));
		Actions a = new Actions(driver);
		a.moveToElement(electronic).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title=\"Mobiles\"]/parent::li/parent::ul/li/a[contains(.,'Mi')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-id=\"MOBFHZ4BZW2GM6UH\"]")).click();
		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs) {
			Thread.sleep(1000);
			driver.switchTo().window(tab);
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _2Npkh4 _2MWPVK\"]")).click();
	}

}
