package week5.day1;

import org.openqa.selenium.By;

import org.testng.annotations.Test;


public class EditLead extends BaseTest {

	@Test
	public void editLead() throws InterruptedException {
		
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("firstName");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	String text = driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']")).getText();
	driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
	Thread.sleep(2000);
	String viewLead = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
	System.out.println("Title of the Page :" +viewLead);
	
	String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
    String companyName1 = companyName.replaceAll("[^a-zA-Z]","");
    System.out.println("Old Company Name : " +companyName1);
	
	driver.findElement(By.linkText("Edit")).click();
			
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestGround");
	Thread.sleep(2000);
			
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	Thread.sleep(2000);
	String newCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	 String newCompanyName1 = newCompanyName.replaceAll("[^a-zA-Z]","");
	 System.out.println("New Company Name : " +newCompanyName1);
	if (companyName1.equals (newCompanyName1)) {
		
		System.out.println("Lead is not Updated");
	}
	else
	{
		System.out.println("Lead is updated");
	}
	
	}
}
	
