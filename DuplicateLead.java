package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();  
	
		driver.get("http://leaftaps.com/opentaps"); 
		
		driver.manage().window().maximize(); 
	
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Lead001@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String firstname = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Title is not verified");
		}
		
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String verifyName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		if (firstname.equals(verifyName)) {
			System.out.println("Duplicate name is same as captured Lead name");
		} else {
			System.out.println("Duplicate name is different");
		}
		
		driver.close();
	}

}
