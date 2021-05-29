package br.com.web.pages;

import static br.com.web.core.DriverFactory.getDriver;
import static br.com.web.util.Parametros.senhaCadastrada;
import static br.com.web.util.Parametros.usuarioCadastrado;

import org.openqa.selenium.By;

import br.com.web.core.BasePage;

public class LogarPage extends BasePage {

	// Elementos Web

	By menuUser = By.id("menuUser");
	By campoUsuario = By.name("username");
	By campoSenha = By.name("password");
	By botaoEntre = By.id("sign_in_btnundefined");
	By btnLogin = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");
	By textoUsuario = By.xpath("//span[@class='hi-user containMiniTitle ng-binding ng-hide']");
	

	public void acessarSite() throws Exception {
		getDriver().get("https://advantageonlineshopping.com/#/");
	}

	public void preencherDadosDeLogin() throws Exception {
		clicar(menuUser);
		escrever(campoUsuario, usuarioCadastrado);
		escrever(campoSenha, senhaCadastrada);
		clicar(botaoEntre);
		

	}

	public void validarLogin() {

		validarTexto("Usuarioteste1", textoUsuario);

	}
}