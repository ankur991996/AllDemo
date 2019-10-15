import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		String d = sc.next();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value=('a')");

		/*
		 * WebElement email =
		 * driver.findElement(By.xpath("//input[@data-testid=\"royal_email\"]"));
		 * WebElement pass =
		 * driver.findElement(By.xpath("//td[@class=\"html7magic\"]/label[@for='pass']")
		 * ); email.sendKeys(pass.getText()); Actions a = new Actions(driver);
		 * a.contextClick(pass).perform();
		 */
		/*
		 * WebElement day = driver.findElement(By.id("month")); Select s = new
		 * Select(day); // s.selectByValue("6"); List<WebElement> months =
		 * s.getOptions(); for (WebElement mon : months) {
		 * System.out.println(mon.getText()); } System.out.println("day is diplayed" +
		 * day.isDisplayed()); System.out.println(day.isEnabled());
		 */
		/*
		 * System.out.println("================="); for (int i = 0; i < months.size();
		 * i++) { System.out.println(months.get(i).getText()); }
		 */
		// driver.findElement(By.partialLinkText("tten acc")).click();

	}

}
