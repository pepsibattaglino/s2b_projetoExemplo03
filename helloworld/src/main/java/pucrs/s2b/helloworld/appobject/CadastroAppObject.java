package pucrs.s2b.helloworld.appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroAppObject {
	
	private WebDriver driver;
	
	
	public CadastroAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNomeCompletoTextField () {
		return this.driver.findElement(By.id("nome"));
	}
	
	public WebElement getEmailTextField () {
		return this.driver.findElement(By.id("email"));
	}
	
	public WebElement getSenhaTextField () {
		return this.driver.findElement(By.id("password"));
	}
	
	public WebElement getConfirmarSenhaTextField () {
		return this.driver.findElement(By.id("passconf"));
	}
	
	public WebElement getTelefoneTextField () {
		return this.driver.findElement(By.id("telefone"));
	}
	
	public WebElement getCidadeComboBox () {
		return	this.driver.findElement(By.id("cidade"));
	}
	
	public WebElement getCadastrarButton () {
		return this.driver.findElement(By.xpath("//*[@id=\"cadastrar\"]/fieldset/div[8]/div/input"));
	}
}
