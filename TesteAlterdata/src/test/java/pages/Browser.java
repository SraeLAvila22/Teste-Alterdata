package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	static WebDriver driver;

	/**
	 * Metodo para abrir navegador CHROME
	 * 
	 * @author Israel
	 * @param site
	 */
	public void abrirBrowser(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.err.println("----- error ao abrir Browser ------" + e.getMessage());
		}
		System.out.println("-------- START TEST --------");
	}
	
	/**
	 * Metodo para fechar o Browser
	 * @author Israel 
	 */
	public void fecharBrowser() {
		driver.quit();
	}

}
