package RegisterTest;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Pages.RegisterPage;
import generics.BaseTest;


//Test class should inherit from Base class.
public class RegisterUserTest extends BaseTest { // this is my child class.
	
	// This is where i am writing my test
	
	RegisterPage rp;
	
	//Properties pr;
	
	
	@Test
	public void reistertest() throws InterruptedException, IOException {
		
		//pr = new Properties();
		
		rp = new RegisterPage(driver);		
		
		
		rp.registeruser(fname,lname ,day,month,year, emailid, pass, cpass);
	}
	
	
	@Test
	public void registeruser2test() throws InterruptedException {
		rp = new RegisterPage(driver);		

		//rp.getFemaleradiobtn();
		
		rp.registeruser("akshay", "koulgi","7","September","1995", "ak@gmail.com", "akshaykoulgi", "akshaykoulgi");

		
	}
	

	

}
