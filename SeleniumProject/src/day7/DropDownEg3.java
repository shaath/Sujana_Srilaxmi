package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg3 
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();
		
		WebElement fcity=driver.findElement(By.id("fromCity"));
		

		Select f=new Select(fcity);
		List<WebElement> flist=f.getOptions();
		
		System.out.println(flist.size());
		
		WebElement t=driver.findElement(By.id("toCity"));
		Select tcity=new Select(t);
		
		
		for (int i = 0; i < flist.size(); i++) 
		{
			f.selectByIndex(i);
			String cityname=flist.get(i).getText();
			System.out.println(cityname);
			
			List<WebElement> tlist=tcity.getOptions();
			for (int j = 0; j < tlist.size(); j++)
			{
				tcity.selectByIndex(j);
				String toCity=tlist.get(j).getText();
				if (cityname.equalsIgnoreCase(toCity))
				{
					flag=true;
					break;
				}
				
			}
			if (flag)
			{
				System.out.println("Fail");
				
			}
			else
			{
				System.out.println("Pass");
			}
			
		}
	}

}
