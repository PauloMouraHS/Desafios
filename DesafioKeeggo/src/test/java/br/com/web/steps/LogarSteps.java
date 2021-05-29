package br.com.web.steps;

import br.com.web.pages.LogarPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LogarSteps {

	private LogarPage page = new LogarPage();

	@Quando("^realizar o login de um usuario cadastrado$")
	public void realizarOLoginDeUmUsuarioCadastrado() throws Throwable {
		page.preencherDadosDeLogin();
	}

	@Entao("^sera exibida o nome do usuario na barra superior$")
	public void seraExibidaONomeDoUsuarioNaBarraSuperior() throws Throwable {
		page.validarLogin();
	}
}	