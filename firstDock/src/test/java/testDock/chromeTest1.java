package testDock;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class chromeTest1 {
	@Test
	public static void test1() throws MalformedURLException, URISyntaxException
	{
	
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("browserName", "firefox");	
		
		
		URL url=new URI("http://localhost:4444/wd/hub").toURL();
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
