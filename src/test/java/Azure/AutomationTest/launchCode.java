package Azure.AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchCode {
@Test
public void testLauunch()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://pranjalbajwanacademy.azurewebsites.net/webapp/");
	driver.manage().window().maximize();
	Assert.assertEquals(driver.findElement(By.xpath("//h1[text()=' RahulShettyAcademy.com Learning']")).getText(), "RahulShettyAcademy.com Learning");
	System.out.println("Test passed");
}
}
