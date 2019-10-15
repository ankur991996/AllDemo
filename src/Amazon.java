import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ScreenSTake.getScreenShot(driver, "amazon1");
		WebElement ele = driver.findElement(By.xpath("//div[@id='desktop-7']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ScreenSTake.getScreenShot(driver, "amazon2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"navFooterBackToTop\"]/span")).click();
		ScreenSTake.getScreenShot(driver, "amazon3");
	}
}
