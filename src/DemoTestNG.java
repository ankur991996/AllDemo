import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNG {
	WebDriver driver;

	@BeforeMethod
	public void preset() {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("BM");
	}

	@AfterMethod
	public void closeD() {
		driver.close();
		System.out.println("Am");
	}

	@Test
	public void demo1() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("alia");
		driver.findElement(By.id("pass")).sendKeys("ranbir");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		System.out.println("D1");
	}

	@Test
	public void demo2() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("deepika");
		driver.findElement(By.id("pass")).sendKeys("ranbir");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		System.out.println("D2");
	}

	@Test
	public void demo3() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("katrina");
		driver.findElement(By.id("pass")).sendKeys("ranbir");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		System.out.println("D3");
	}
}
