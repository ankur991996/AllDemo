import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screeS = ts.getScreenshotAs(OutputType.FILE);
		File saveS = new File("./ScreenShot/firefox.png");
		Files.copy(screeS, saveS);
	}

}
