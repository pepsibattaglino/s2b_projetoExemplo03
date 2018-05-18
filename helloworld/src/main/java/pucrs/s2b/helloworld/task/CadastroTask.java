package pucrs.s2b.helloworld.task;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pucrs.s2b.helloworld.appobject.CadastroAppObject;

public class CadastroTask {

	private CadastroAppObject cadastroAppObject;
	
	public CadastroTask(WebDriver driver) {
		this.cadastroAppObject = new CadastroAppObject(driver);
	}
	
	public void preencherCadastro (String nome, String email, String senha, String confirmarSenha, String telefone, String cidade) {
		this.cadastroAppObject.getNomeCompletoTextField().sendKeys(nome);
		this.cadastroAppObject.getEmailTextField().sendKeys(email);
		this.cadastroAppObject.getSenhaTextField().sendKeys(senha);
		this.cadastroAppObject.getConfirmarSenhaTextField().sendKeys(confirmarSenha);
		this.cadastroAppObject.getTelefoneTextField().sendKeys(telefone);
		this.cadastroAppObject.getCidadeComboBox().sendKeys(Keys.ARROW_DOWN);
		this.cadastroAppObject.getCidadeComboBox().sendKeys(Keys.ENTER);
		
		
	}
	
	public void enviarFormulario () {
		this.cadastroAppObject.getCadastrarButton().click();
	}
	
}
