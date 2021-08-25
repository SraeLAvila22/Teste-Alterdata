package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Browser;

import pages.TelaDeLoginPage;

public class FazerLoginTeste {

	Browser browser = new Browser();
	TelaDeLoginPage login = new TelaDeLoginPage();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) {
		browser.abrirBrowser(site);
	}

	@When("informar os dados de login validos")
	public void informar_os_dados_de_login_validos() {
		login.formularioDeLoginValido();
	}

	@Then("login realizado com sucesso")
	public void login_realizado_com_sucesso() {
		login.loginEvidencia("Login realizado com sucesso", "Okay");
	}

	@When("informar os dados de login invalidos")
	public void informar_os_dados_de_login_invalidos() {
		login.formularioDeLoginInvalido();

	}

	@Then("login nao sera realizado com a mensagem error")
	public void login_nao_sera_realizado_com_a_mensagem_error() {
		login.loginEvidencia("Login não realizado com a mensagem 'error' ", "Error");

	}

	@When("nao informar nenhum dado de login")
	public void nao_informar_nenhum_dado_de_login() {
		login.formularioDeLoginBranco();

	}

}
