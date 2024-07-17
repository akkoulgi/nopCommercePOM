package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest { // This is my parent class
	
	protected WebDriver driver;
	protected String fname;
	protected String lname;
	protected String day;
	protected String month;
	protected String year ;
	protected String emailid ;
	protected String pass;
	protected String cpass ;


	@BeforeClass
	public void setup() throws IOException {
		
		driver = new ChromeDriver();
		
		
		Properties pr = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Documents\\RestAssuredWorkspace\\NopPOM\\src\\test\\resources\\config.properties");
		
		pr.load(fis);
		
		String url = pr.getProperty("url");

		 fname =pr.getProperty("firstname");
		 lname =pr.getProperty("lastname");
		 day =pr.getProperty("day");
		 month =pr.getProperty("month");
		 year =pr.getProperty("year");
		 emailid =pr.getProperty("email");
		 pass =pr.getProperty("passwsord");
		 cpass =pr.getProperty("conformp");

		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
	
	}
	
	
	@AfterClass
	public void teardown() {
		
	driver.quit();	
		
	}

}
