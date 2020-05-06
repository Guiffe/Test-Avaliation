package avaliacaoSelenium;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	public void testDiretor() {

		Diretor diretor1 = new Diretor("Steven Spielberg", " 1946");
		Diretor diretor2 = new Diretor("Stanley Kubrick", " 1928");
		Diretor diretor3 = new Diretor("Christopher Nolan", " 1970");

		ArrayList<Diretor> diretores = new ArrayList<Diretor>();

		diretores.add(diretor1);
		diretores.add(diretor2);
		diretores.add(diretor3);

		for (int i = 0; i < diretores.size(); i++) {

			String diretor = diretores.get(i).toString();

			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(diretor);
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
			String campoResultados = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
			System.out.println(campoResultados);
			
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
							
		}

	}

	@Test
	public void testFilmes() {

		Filmes filme1 = new Filmes("E.T.: O Extraterrestre", " 1982");
		Filmes filme2 = new Filmes("O Iluminado", " 1980");
		Filmes filme3 = new Filmes("Interestelar", " 2014");

		List<Filmes> filmes = new ArrayList<Filmes>();

		filmes.add(filme1);
		filmes.add(filme2);
		filmes.add(filme3);

		for (int i = 0; i < filmes.size(); i++) {

			String filme = filmes.get(i).toString();

			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(filme);
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
			String campoResultados = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
			System.out.println(campoResultados);
			
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
		}

	}

	@After
	public void fecharBrowser() {

		driver.quit();

	}

}
