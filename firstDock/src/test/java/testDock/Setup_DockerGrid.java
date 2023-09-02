package testDock;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Setup_DockerGrid {
	@BeforeTest
void startDockerGrid() throws IOException, InterruptedException
{Runtime.getRuntime().exec("cmd /c start start_docker.bat");
Thread.sleep(15000);
}

}
