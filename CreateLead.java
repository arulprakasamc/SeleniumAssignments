package week5.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseTest {
	
	@Test
	public void createLead() {
		
	
		// Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("firstName");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lastName");
		
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDd = new Select(eleSource);
		sourceDd.selectByVisibleText("Partner");
		
		WebElement eleMarkCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select markCampDd = new Select(eleMarkCamp);
		markCampDd.selectByVisibleText("Road and Track");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Arul");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("C");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Sir");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/24/97");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Manufacturing");
		
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("30000000");
		
		WebElement eleCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select currencyDd = new Select(eleCurrency);
		currencyDd.selectByVisibleText("ZAR - South African Rand");
		
		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDd = new Select(eleIndustry);
		industryDd.selectByVisibleText("Manufacturing");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100000");
		
		WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDd = new Select(eleOwnership);
		ownershipDd.selectByVisibleText("Corporation");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12454");
		
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("VOD");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead Creation");
		
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Lead Creation");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("008");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("004");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9865678564");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("04142");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Lead");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Lead001@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("firstName");
		
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Name");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address1");
		
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address2");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Louisiana");
		
		WebElement eleProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select provinceDd = new Select(eleProvince);
		provinceDd.selectByVisibleText("Louisiana");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("0976");
		
		WebElement eleCountry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryDd = new Select(eleCountry);
		countryDd.selectByVisibleText("United States");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("23343");
		
		driver.findElement(By.name("submitButton")).click();
		
		// Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestGround");
		
		driver.findElement(By.name("submitButton")).click();
		
		String compName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String updateCompName = compName.replaceAll("[^a-zA-Z]", " ");
		
		if (updateCompName.contains("TestGround")) {
			System.out.println("Lead is created");
		} else {
			System.err.println("Lead is not created");
		}
	}

}
