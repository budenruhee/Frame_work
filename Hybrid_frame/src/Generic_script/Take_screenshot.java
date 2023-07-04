package Generic_script;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_screenshot {

		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.facebook.com/");
			Thread.sleep(2000);
			//step1
			TakesScreenshot ts=(TakesScreenshot)driver;
			//step2
			File src = ts.getScreenshotAs(OutputType.FILE);
			//step3
			File dst=new File("C:\\Users\\hp\\Documents\\SELENIUM\\gowri.png");
			//step4
			FileHandler.copy(src, dst);
			
			
		}

	}


