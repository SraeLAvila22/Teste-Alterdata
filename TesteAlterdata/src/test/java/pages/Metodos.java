package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browser {

	/**
	 * Metodo para clicar em um elemento
	 * 
	 * @author Israel
	 * @param passo
	 * @param element
	 */
	public void click(By element) {
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			System.err.println("----- error ao clilcar no passo" + e.getMessage());
		}
	}

	/**
	 * Metodo para escrever em um elemento
	 * 
	 * @author Israel
	 * @param element
	 * @param text
	 * @param passo
	 */
	public void escrever(By element, String text) {
		try {
			driver.findElement(element).sendKeys(text);
		} catch (Exception e) {
			System.err.println("----- error ao escrever no passo " + e.getMessage());
		}
	}

	/**
	 * Metodo para tirar um screenshot da tela
	 * 
	 * @author Israel
	 * @param nomeEvidencia
	 */
	public void screenShot(String nomeEvidencia) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./src/Evidencias/" + nomeEvidencia + ".png");
			FileUtils.copyFile(scrFile, destFile);

		} catch (Exception e) {
			System.err.println("-------- error ao tirar screenShot " + e.getMessage());
		}

	}

	/**
	 * Metodo para validar texto
	 * 
	 * @author Israel
	 * @param element
	 * @param textoEsperado
	 * @param passo
	 */
	public void assertText(By element, String textoEsperado) {
		try {
			String screenText = driver.findElement(element).getText();
			assertEquals(textoEsperado, screenText);
			System.out.println("O texto esperado foi " + screenText);
		} catch (Exception e) {
			System.err.println("-------- error ao validar texto " + e.getMessage());
		}

	}

	/**
	 * Metodo para gerar um email com 4 letras aleatórias
	 * 
	 * @author Israel
	 * @return
	 */
	public String emailgenerator() {
		String generatedString = RandomStringUtils.randomAlphabetic(4);
		return (generatedString + "@email.com");
	}

	/**
	 * Metodo para gerar uma senha com 4 letras aleatórias
	 * 
	 * @author Israel
	 * @return
	 */
	public String passGenerator() {
		String generatedString = RandomStringUtils.randomAlphabetic(4);
		return ("pass1" + generatedString);
	}

	/**
	 * Metodo para pausar a execução do teste utilizar 1000 para um segundo e assim
	 * por diante.
	 * 
	 * @author Israel
	 * @param time
	 */
	public void threadSleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			System.err.println("-------- error ao pausar a aplicação " + e.getMessage());
		}

	}

}
