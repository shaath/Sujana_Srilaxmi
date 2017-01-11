package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args) 
	{
		//Launching the firefox browser
		FirefoxDriver d=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
//		ChromeDriver d=new ChromeDriver();
		
		//Launching the gmail application in browser
		d.get("http://gmail.com");
		//Maximizing the window
		d.manage().window().maximize();
		//Identifying the email text box
		WebElement email=d.findElement(By.id("Email"));
		//Sending the text into the email text box
		email.sendKeys("sharathqedge449");
		
//		Sleeper.sleepTightInSeconds(5);
//		
//		email.clear();
		//clicking on the next button
		d.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		
		//Entering password into text box
		d.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		//Clicking on the signin button
		d.findElement(By.cssSelector("#signIn")).click();

	}

}
