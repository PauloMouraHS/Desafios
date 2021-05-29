package br.com.web.pages;

import static br.com.web.core.DriverFactory.getDriver;
import static br.com.web.util.Parametros.criarCidade;
import static br.com.web.util.Parametros.criarEmail;
import static br.com.web.util.Parametros.criarNomeUsuario;
import static br.com.web.util.Parametros.criarPrimeiroNome;
import static br.com.web.util.Parametros.criarSenha;
import static br.com.web.util.Parametros.criarSobrenome;
import static br.com.web.util.Parametros.criarTelefone;
import static br.com.web.util.Parametros.criarEndereco;
import static br.com.web.util.Parametros.criarEstado;
import static br.com.web.util.Parametros.criarCep;

import org.openqa.selenium.By;
import br.com.web.core.BasePage;

public class CadastrarUsuarioPage extends BasePage {

	// Elementos Web

	By menuUser = By.id("menuUser");
	By novaConta = By.xpath("(//a[@role='link'])[2]");
	By campoUserName = By.name("usernameRegisterPage");
	By campoEmail = By.name("emailRegisterPage");
	By campoSenha = By.name("passwordRegisterPage");
	By campoConfirmarSenha = By.name("confirm_passwordRegisterPage");
	By campoNome = By.name("first_nameRegisterPage");
	By campoSobrenome = By.name("last_nameRegisterPage");
	By campoTelefone = By.name("phone_numberRegisterPage");
	By campoPais = By.name("countryListboxRegisterPage");
	By selPais = By.xpath("//option[@label='Brazil']");
	By campoCidade = By.name("cityRegisterPage");
	By campoEndereco = By.name("addressRegisterPage");
	By campoEstado = By.name("state_/_province_/_regionRegisterPage");
	By campoCep = By.name("postal_codeRegisterPage");
	By botaoEuAceito = By.name("i_agree");
	By botaoRegistro = By.id("register_btnundefined");
	By textoLogin = By.xpath("//*[contains(text(),'Chabu')]");

	public void acessarSite() throws Exception {
		getDriver().get("https://advantageonlineshopping.com/#/");
	}

	public void preencherDadosDeCadastro() {
		clicar(menuUser);
		clicar(novaConta);
		escrever(campoUserName, criarNomeUsuario);
		escrever(campoEmail, criarEmail);
		escrever(campoSenha, criarSenha);
		escrever(campoConfirmarSenha, criarSenha);
		escrever(campoNome, criarPrimeiroNome);
		escrever(campoSobrenome, criarSobrenome);
		escrever(campoTelefone, criarTelefone);
		escrever(campoCidade, criarCidade);
		escrever(campoEndereco, criarEndereco);
		escrever(campoEstado, criarEstado);
		escrever(campoCep, criarCep);
		clicar(botaoEuAceito);
		clicar(botaoRegistro);
	}

	public void validarCadastroDeUsuario() {
		validarTexto("Newnovo", textoLogin);
	}
}