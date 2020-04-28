package test;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {

	@Test(priority=1)
	public void search()
	{
		WebDriver driver=new ChromeDriver();
		//WebDriver driver1=new ChromeDriver();
		driver.manage().window().maximize();
		//driver1.get("http://magento.com");
		driver.get("http://yahoo.com");
		String s=driver.getCurrentUrl();
		System.out.println(driver.getTitle());
		System.out.println(s);
		driver.manage().window().maximize();
		if (s.startsWith("https://"))
		{
			System.out.println("security certificate application");
			
		}
		
		if (s.contains("i`\n.")|| s.contains(".in"))
		{
			System.out.println("localised in india");
		}
		driver.quit();
	}
	
	@Test(priority=2,enabled = false)
	public void magentoRegister() throws InterruptedException
	{
		 WebDriver driver=new ChromeDriver();
		   //to maximize the browser screen
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     
		     driver.get("http://google.com");
		     driver.findElement(By.name("q")).clear();
		     driver.findElement(By.name("q")).sendKeys("Selenium");
		     driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div/span")).click();
		     Thread.sleep(5000);
		     driver.findElement(By.partialLinkText("Selenium")).click();
		     //String title=driver.getTitle();
		     AssertJUnit.assertEquals(driver.getTitle(), "SeleniumHQ Browser Automation");
		     /*  if(title.equals("SeleniumHQ Browser Automation"))
		    	 System.out.println("test case pass");
		   
		     */
		     
		     
		     //to open the web page
		     driver.get("http://magento.com");
		    
		     //copy xpath using inspect from the web page(here user icon) and click on it
		     driver.findElement(By.className("account-icon")).click();
		     
		     driver.findElement(By.id("register")).click();
		     driver.findElement(By.id("firstname")).clear();
		     driver.findElement(By.id("firstname")).clear();
		     driver.findElement(By.id("firstname")).sendKeys("nandha");
		     driver.findElement(By.id("lastname")).clear();
		     driver.findElement(By.id("lastname")).sendKeys("nandha");
		     driver.findElement(By.id("email_address")).clear();
		     driver.findElement(By.id("email_address")).sendKeys("nandha@gmail.com");
		     Thread.sleep(5000);
		     Select cp = new Select(driver.findElement(By.id("company_type")));
		     cp.selectByValue("tech_partner");
		     
		     Select role = new Select(driver.findElement(By.id("individual_role")));
		     role.selectByValue("technical/developer");
		     
		     Select c = new Select(driver.findElement(By.id("country")));
		     // c.deselectByVisibleText("India");
		     c.selectByIndex(1);
		    
		     driver.findElement(By.id("password")).clear();
		     driver.findElement(By.id("password")).sendKeys("1243jdsbfsdf");
		     
		     driver.findElement(By.id("password-confirmation")).clear();
		     driver.findElement(By.id("password-confirmation")).sendKeys("1243jdsbfsdf");
		     if(driver.findElement(By.id("agree_terms")).isSelected()==false)
		     {
		    	 driver.findElement(By.id("agree_terms")).click();
		     }
		     /*driver.findElement(By.id("email")).clear();
		     driver.findElement(By.id("email")).sendKeys("arvnan5@gmail.com");
		     
		     driver.findElement(By.id("pass")).clear();
		     driver.findElement(By.id("pass")).sendKeys("abcdef");
		     
		     driver.findElement(By.id("send2")).click();
		     Thread.sleep(5000);
		     String s=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
		     
		     //System.out.println(s);
		     
		     if(s.contentEquals("Invalid login or password."))
		     {
		    	 System.out.println("test case passed");
		     }     
		     */
		     
		   driver.quit();
			
			
	}
}
