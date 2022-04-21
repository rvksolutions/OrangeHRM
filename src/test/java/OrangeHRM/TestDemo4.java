package OrangeHRM;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners({ TestDemo5.class})
public class TestDemo4 {
  @Test
  public void testCase1() {
	  Assert.fail();
	  System.out.println("I'm not going to execute");
  }
  
  @Test
  public void testCase2() {
	 
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(1, 2);
	  System.out.println("I'm  going to execute");
  }
}
