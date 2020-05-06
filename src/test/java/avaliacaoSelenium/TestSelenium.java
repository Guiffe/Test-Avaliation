package avaliacaoSelenium;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	private WebDriver driver;

	@Before
	public void abrirBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void test() {

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Chad Stahelski John wick");
		driver.findElement(By.xpath("//input[@value='Pesquisa Google']")).click();

		String campoResultados = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
		System.out.println(campoResultados);

	}

	@After
	public void fecharBrowser() {

		driver.quit();

	}

}
