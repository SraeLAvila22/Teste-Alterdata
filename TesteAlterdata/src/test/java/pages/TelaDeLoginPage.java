package pages;

import elementos.Elements;

public class TelaDeLoginPage {

	Elements elmt = new Elements();
	Metodos mtd = new Metodos();
	Browser browser = new Browser();

	public void formularioDeLoginValido() {
		mtd.escrever(elmt.getEmail(), "admin@admin.com");
		mtd.escrever(elmt.getSenha(), "admin123");
		mtd.click(elmt.getBtnEntrar());

	}

	public void formularioDeLoginInvalido() {
		mtd.escrever(elmt.getEmail(), mtd.emailgenerator());
		mtd.escrever(elmt.getSenha(), mtd.passGenerator());
		mtd.click(elmt.getBtnEntrar());

	}

	public void formularioDeLoginBranco() {
		mtd.escrever(elmt.getEmail(), "");
		mtd.escrever(elmt.getSenha(), "");
		mtd.click(elmt.getBtnEntrar());
	}
	
	public void loginEvidencia(String nomeEvidencia, String textoEsperado) {
		mtd.threadSleep(2000);
		mtd.screenShot(nomeEvidencia);
		mtd.assertText(elmt.getBtnEntrar(), textoEsperado);
		browser.fecharBrowser();
		
	}

}
