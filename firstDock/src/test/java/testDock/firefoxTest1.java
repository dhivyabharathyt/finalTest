package testDock;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class firefoxTest1 {
	@Test
	public static void test4() throws MalformedURLException
	{
	
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("browserName", "firefox");	
		
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
