package pucrs.s2b.helloworld.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pucrs.s2b.helloworld.task.CadastroTask;

public class CadastroTesteCase {
	
	private WebDriver driver;
	private CadastroTask cadastro; 
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("http://www.xiru.rs/d/trocas/homolog/usuarios/cadastrar");
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTask(driver);
	}
	
	@Test
	public void testMain() {
		cadastro.preencherCadastro("Jiusep Batalhinow", "jusepba@gmail.com", "senhasenha", "senhasenaha", "9112345678", "Porto Alegre");
		cadastro.enviarFormulario();
	}
	
	
	@After
	public void tearDown() {
//		this.driver.quit();
	}

}
