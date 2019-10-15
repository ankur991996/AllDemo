import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		/*
		 * driver.findElement(By.name("btnLogin")).click(); Alert a =
		 * driver.switchTo().alert(); Thread.sleep(2000);
		 * System.out.println(a.getText()); a.accept();
		 */
	}
}
