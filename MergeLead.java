package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {
	
	public static void main(String[] args) throws InterruptedException {
		 
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();  
	
		driver.get("http://leaftaps.com/opentaps"); 
		
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		driver.findElement(By.xpath("//span[text()='From Contact']/following::img")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		List<String> lstOfWindows = new ArrayList<String>(allWindows);
		
		driver.switchTo().window(lstOfWindows.get(1));
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		
		driver.switchTo().window(lstOfWindows.get(0));
		
		driver.findElement(By.xpath("//span[text()='To Contact']/following::img")).click();
		
		allWindows = driver.getWindowHandles();
		
		lstOfWindows = new ArrayList<String>(allWindows);
		
		driver.switchTo().window(lstOfWindows.get(1));
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		
		driver.switchTo().window(lstOfWindows.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.getTitle());
			
		
	}
	
	

}
