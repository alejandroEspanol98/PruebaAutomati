package Com.qualitystrem.prueba;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pruebalink {

	private WebDriver driver; 
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver3.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get( "https://www.choucairtesting.com/");	
	}
	
	@Test
	public void testchoucairtesting() throws InterruptedException {

		 WebElement searchbox = driver.findElement(By.linkText("Empleos")); 
		 searchbox.click();
		 WebElement searchbox2 = driver.findElement(By.linkText("Marcos de trabajo de pruebas"));
		 searchbox2.click();
		  Thread.sleep(3000);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	@After
	public void tearDown(){
		/* driver.quit(); */
	}
}
