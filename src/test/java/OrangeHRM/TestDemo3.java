package OrangeHRM;

import org.testng.annotations.Test;

public class TestDemo3 {
	
	@Test(enabled=true,priority = 2,groups= {"sanity","regression"} )
	  public void loginWithAdminUser() {
		
		System.out.println("Admin User");
	  }
	
	
	@Test(enabled=true,priority = 2,groups= {"regression"} )
	  public void loginWithAdminUser2() {
		
		System.out.println("Admin User2");
	  }
	
  @Test(enabled=true,priority = 1,dependsOnGroups = "sanity")
  public void loginWithUser() {
	  System.out.println("Normal User");
  }
}
