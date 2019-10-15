import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest {

	@BeforeMethod
	public void Bm() {
		Reporter.log("Bm", true);
	}

	@Test(dependsOnMethods = "demo1")
	public void demo() {
		Reporter.log("ankur", true);
	}

	@Test()
	public void demo1() {
		Reporter.log("ankur1", true);
		Assert.fail();
	}

	@Test()
	public void demo2() {
		Reporter.log("ankur2", true);
	}

	@Test()
	public void demo3() {
		Reporter.log("ankur3", true);
	}

	@AfterMethod
	public void Am() {
		Reporter.log("Am", true);
	}

}
