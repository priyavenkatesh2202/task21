package task21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open the browser
		WebDriver driver = new ChromeDriver();
		
		// launch the browser
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// switch to topframe
	driver.switchTo().frame(0);
		
		// to verify no.of.frames on the page
	List<WebElement> frames = driver.findElements(By.tagName("frame"));
	System.out.println("Total number of frames in the top frame :" + frames.size());
	
	
		//to switch to left frame
	driver.switchTo().frame(0);
	
		//to verify the left frame text
	String fr = driver.findElement(By.tagName("body")).getText();
    
    System.out.println( fr );
   
   
    	//to switch back to topframe
   driver.switchTo().parentFrame();
   
   
   		// to switch to middle frame
   driver.switchTo().frame(1);
   
   		// verify the text Middle
   String frr = driver.findElement(By.xpath("//body")).getText();
   
   System.out.println( frr );
   
   
   		//to switch to back to the top frame 
   driver.switchTo().parentFrame();
   
   		// to switch to the Right frame
   driver.switchTo().frame(2);
   
   
   		// to verify the text Right
   String fm = driver.findElement(By.xpath("//body")).getText();
   
   System.out.println( fm );
   
   
   		// switch to the top frame
   driver.switchTo().parentFrame();
   
   		// switch back to the main frame
   driver.switchTo().defaultContent();
   
   		// switch to the bottom frame
   driver.switchTo().frame(1);
   		
   
   		// verify the text bottom
   String fra = driver.findElement(By.xpath("//body")).getText();
   
   System.out.println( fra );
   
   driver.switchTo().parentFrame();
   
   driver.switchTo().defaultContent();
   
   	// to get the URL
  String T  = driver.getCurrentUrl(); 
	
  System.out.println("current Url is: "+ T);
   
   
   
   
   
	

}
}
