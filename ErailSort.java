package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();  
	
		driver.get("https://erail.in/"); 
		driver.manage().window().maximize(); 
	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("DLI");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
		
		
		driver.findElement(By.id("buttonFromTo")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> trains = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]//td[2]"));
		
		List<String> trainName = new ArrayList<String>();
		
		for (int i = 0; i < trains.size(); i++) {
			trainName.add(trains.get(i).getText());			
		}
		Collections.sort(trainName);
		System.out.println(trainName);
	}

}
