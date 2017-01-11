package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CheckBoxEg {

	public static void main(String[] args) 
	{
		FirefoxDriver d=new FirefoxDriver();
		//Launching the gmail application in browser
		d.get("http://gmail.com");
		//Maximizing the window
		d.manage().window().maximize();
		//Identifying the email text box
		WebElement email=d.findElement(By.id("Email"));
		//Sending the text into the email text box
		email.sendKeys("sharathqedge449");
		//clicking on the next button
		d.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);

		WebElement check=d.findElement(By.id("PersistentCookie"));
		if (check.isSelected()) 
		{
			check.click();
		}
		else
		{
			System.out.println("It is already in unselected position");
		}
	}

}
