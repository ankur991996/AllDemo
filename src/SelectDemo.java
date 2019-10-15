import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/select.html");
		WebElement opt = driver.findElement(By.id("b"));
		Select s = new Select(opt);
		List<WebElement> op = s.getOptions();
		for (int i = 0; i < op.size(); i++) {
			if (s.isMultiple()) {
				s.selectByIndex(i);
				Thread.sleep(1000);
			}
		}
		System.out.println(s.getFirstSelectedOption().getText());
		List<WebElement> o = s.getAllSelectedOptions();
		for (WebElement on : o) {
			System.out.println(on.getText());
		}
	}
}
