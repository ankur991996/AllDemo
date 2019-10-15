import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExp {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) {
		/*
		 * WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://demo.actitime.com/login.do");
		 * driver.findElement(By.id("username")).sendKeys("admin");
		 * driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);
		 * WebDriverWait ww = new WebDriverWait(driver, 10);
		 * ww.until(ExpectedConditions.titleContains("Time"));
		 * driver.findElement(By.id("logoutLink")).click();
		 */
		String item = "MEN";
		String name = item.substring(0, 1) + item.substring(1).toLowerCase();
		System.out.println(name);
	}
}
