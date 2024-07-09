package task21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window1 {

	
			public static void main(String[] args) {
			
				// open the browser
				WebDriver driver = new ChromeDriver();
				
				//launch the URL
				driver.get("https://the-internet.herokuapp.com/windows");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
			
				
				//click "click here button"
				driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
				
		
		
				// to switch to new window
			String winHandleBefore = driver.getWindowHandle();
			
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			
				// check the new window text is present on the page
			String E = driver.findElement(By.tagName("h3")).getText();
			
			
				// print to verify whether the text is present
			System.out.println( E);
			
			
				// close the new window
			driver.close();
			
			
				//switch to original window
			
			driver.switchTo().window(winHandleBefore);
			
				//to verify that the original window is active
			
			System.out.println(driver.getTitle());
				// close the browser
			driver.close();
			
			

			 
			
			  
				
				
				
				
	}

}
