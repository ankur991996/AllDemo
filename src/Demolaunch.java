import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumhq.org/");
		Thread.sleep(2000);
		/*
		 * driver.navigate().back(); Thread.sleep(2000); driver.navigate().forward();
		 */
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
	}

}
