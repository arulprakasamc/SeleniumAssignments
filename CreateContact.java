package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();  
	
		driver.get("http://leaftaps.com/opentaps"); 
		driver.manage().window().maximize(); 
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Firstname");
		driver.findElement(By.id("lastNameField")).sendKeys("Lastname");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("FirstnameLocal");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("LastnameLocal");
		driver.findElement(By.name("departmentName")).sendKeys("Manufacturing");
		driver.findElement(By.name("description")).sendKeys("Description for create Lead");
		driver.findElement(By.name("primaryEmail")).sendKeys("firstname@gmail.com");
		
		WebElement eleProvince = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select provinceDd = new Select(eleProvince);
		provinceDd.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("updateContactForm_importantNote");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		
		System.out.println(title);
		

	}

}
