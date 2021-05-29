package br.com.web.steps;

import br.com.web.pages.CadastrarUsuarioPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastrarUsuarioSteps {

	private CadastrarUsuarioPage page = new CadastrarUsuarioPage();

	@Dado("^que um usuario acesse o site Advanced Shopping$")
	public void queUmUsuarioAcesseOSiteAdvancedShopping() throws Throwable {
		page.acessarSite();
	}

	@Quando("^realizar o cadastro de um novo usuario$")
	public void realizarOCadastroDeUmNovoUsuario() throws Throwable {
		page.preencherDadosDeCadastro();
	}

	@Entao("^um novo usuario sera cadastrado$")
	public void umNovoUsuarioSeraCadastrado() throws Throwable {
		page.validarCadastroDeUsuario();
		
	}
}