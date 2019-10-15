import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("==================");
		Set<String> wins = driver.getWindowHandles();
		wins.remove(parent);
		for (String win : wins) {
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
		}
		System.out.println(wins.getClass());
	}

}
