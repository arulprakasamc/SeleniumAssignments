package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "TestPlayGround";
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
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("firstname");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		String title = driver.getTitle();
		if (title.contains("View Lead")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Title is not verified");
		}
		
		// Edit Lead
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String updatedName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(updatedName);
		
		if(updatedName.contains(name)) {
			System.out.println("Company name is updated"); 
		} else {
			System.out.println("Company name is not updated"); 
		}
		
		driver.close();
		
	}

}
