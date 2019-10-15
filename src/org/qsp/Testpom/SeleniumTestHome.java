package org.qsp.Testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.SeleniumHome;

public class SeleniumTestHome {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/");
		SeleniumHome sh = new SeleniumHome(driver);
		sh.sendText("java");
		sh.goClick();
		driver.navigate().back();
		sh.searchClr();
		sh.sendText("testng");
		sh.goClick();
	}
}
