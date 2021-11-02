import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromee1 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eclipse-workspace\\July 2021\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/JBK%20&%20TESTING%20NOTES/SELENIUM/Offline%20Website/index.html");
		String name=driver.getTitle();
		System.out.println("Tilte of Page:"+name);
		//driver.close();
	}

}
