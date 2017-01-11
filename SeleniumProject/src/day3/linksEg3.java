package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linksEg3
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links availble in the page "+links.size());

		for (int i = 0; i < links.size(); i++)
		{
			String lText=links.get(i).getText();
			if (lText.equalsIgnoreCase("Gmail"))
			{
				flag=true;
				break;
			}
		}
		
		if (flag==true)
		{
			System.out.println("The expected link is available");
		}
		else
		{
			System.out.println("The expected link is not available");
		}
	}
}
