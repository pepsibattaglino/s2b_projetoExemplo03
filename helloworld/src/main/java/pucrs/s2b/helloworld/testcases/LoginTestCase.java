package pucrs.s2b.helloworld.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pucrs.s2b.helloworld.verificationpoint.LoginVerificationPoint;

public class LoginTestCase {
	private WebDriver driver;
	private LoginVerificationPoint verificationPoint; 
	
	@Before//esse método faz com que o navegador seja aberto.
	public void setUp() {
		WebDriverManager.chromedriver().setup();//faz o setup automaticamente
		this.driver = new ChromeDriver();//caso o navegador for outro é só mudar o nome antes do Driver, ficando, FirefoxDriver...etc...
		this.driver.get("http://demo.virtuemart.net/");//seta a URL
		
		this.verificationPoint = new LoginVerificationPoint(driver);
	}
	
	
	@Test
	public void testMain() {
		WebElement usernameTextField =  this.driver.findElement(By.id("modlgn-username"));
		usernameTextField.sendKeys("demo");
		
		WebElement passwordTextField = this.driver.findElement(By.id("modlgn-passwd"));
		passwordTextField.sendKeys("demo");
		
		WebElement loginButton = this.driver.findElement(By.name("Submit"));
		loginButton.click();
//		loginButton.submit();//a ação gerada é a mesma que com click()
		
		verificationPoint.checkHelloMessage();
	}



	
	@After//esse método faz com que o navegador seja fechado matando o processo.
	public void tearDown() {
		this.driver.quit();//poderia ser usado o metodo close() mas isso resaltaria em fechar o navegador mas continuando com o processo.
	}
	
}
