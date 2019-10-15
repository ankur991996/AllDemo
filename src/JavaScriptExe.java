import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		WebElement ele = driver.findElement(By.xpath("//h2[contains(.,'Selenium Sponsors')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		// js.executeScript("window.scrollBy(0,500)");// for scrolling till index

		js.executeScript("arguments[0].scrollIntoView()", ele);
		// window.scrollTo(0,document.body.scrollHeight)
	}
}
