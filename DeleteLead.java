package week5.day1;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteLead extends BaseTest {

	@Test(enabled=false)
	public void main() throws InterruptedException {
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9865678564");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String verifyText = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(verifyText);
		
		if (verifyText.contains("No records to display")) {
			System.out.println("Lead is deleted"); }
		else {
			System.out.println("Lead is not deleted");
		}
	
		

	}

}
