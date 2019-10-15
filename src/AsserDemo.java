import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserDemo {
	@Test
	public void demo() {
		int i = 5;
		int j = 5;
		Assert.assertEquals(j, i);
		System.out.println("validate");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(9, 19);
		System.out.println("hi");
		sa.assertAll();
		
		
		
		
		
		
	}

}
