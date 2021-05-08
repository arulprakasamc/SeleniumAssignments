package week3.assignments;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUniqueTrain {
	
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
			driver.findElement(By.id("txtStationTo")).sendKeys("CBE");
			driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
			
			
			driver.findElement(By.id("buttonFromTo")).click();
			
			Thread.sleep(2000);
			
			List<WebElement> trains = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]//td[2]"));
			System.out.println(trains.size());
			Set<String> trainName = new TreeSet<String>();
			
			for (int i = 0; i < trains.size(); i++) {
				trainName.add(trains.get(i).getText());			
			}
		
			System.out.println(trainName.size());
		}

	}
