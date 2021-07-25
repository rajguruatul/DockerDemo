package DockerSeGridPractise.DockerSeGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeDemo 
{
	
	@Test
	public void testApp() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setBrowserName(BrowserType.CHROME);
		
		WebDriver d =new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps); 
		d.get("https://www.google.com");
		d.findElement(By.name("q")).sendKeys("Learn Automation");
		
		Thread.sleep(10000);
		
		d.quit();
		
	} 
}
