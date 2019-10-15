import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/sam1.html");
		 WebDriverWait ww= new WebDriverWait(driver, 10);
	/*	(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.name("textB")).isDisplayed();
			}
		});*/
		 ww.until(new ExpectedCondition<Boolean>(){
			 @Override
			public Boolean apply(WebDriver driver) {
				 WebElement b = driver.findElement(By.name("textB"));
				 boolean dis = b.isDisplayed();
				return dis;
			}
		 });
		driver.findElement(By.name("textA")).sendKeys("Ankur");

	}

}
