import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class JunitMaster 
{
	public static WebDriver driver;
	@BeforeClass
	public static void primusLaunch()
	{
		driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public static void primus_Logout_Close()
	{
//		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
		driver.close();
	}

}
