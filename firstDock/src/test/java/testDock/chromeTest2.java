package testDock;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class chromeTest2 {
	@Test
	public static void test2() throws MalformedURLException
	{
	
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("browserName", "chrome");	
		
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
