package OrangeHRM;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {

  @Parameters({"bname"})
  @Test
  public void readBrowserName(@Optional("firefox") String bname) {
	  System.out.println(bname);
  }
}
