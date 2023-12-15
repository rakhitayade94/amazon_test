package Amazon_test;
import org.testng.annotations.Test;

import pom.Amazon_main_page;


public class Amazon_Test extends pojo.BaseClass
{
	
	


	@Test()
	public void amazonTest() throws InterruptedException {
		
	
	
		Amazon_main_page a= new Amazon_main_page(driver);
		
		
		
		a.signin();
		a.createamazonac();
		a.name();
		a.email_id();
		a.password();
		a.passwordreck();
		a.verifyemail();
		
		
	
		
		

	}
	}	



