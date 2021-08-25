package elementos;

import org.openqa.selenium.By;

public class Elements {

	private By email = By.id("email");
	private By senha = By.id("senha");
	private By btnEntrar = By.id("btn-entrar");

	public By getEmail() {
		return email;
	}

	public By getSenha() {
		return senha;
	}

	public By getBtnEntrar() {
		return btnEntrar;
	}

}
