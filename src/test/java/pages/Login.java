package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Login {

    private final Page page;

    // === Localizadores ===
    private final Locator inputUsuario;
    private final Locator inputPassword;
    private final Locator botonAcceder;

    // === Constructor ===
    public Login(Page page) {
        this.page = page;
        this.inputUsuario = page.locator("#imUname");
        this.inputPassword = page.locator("#imPwd");
        this.botonAcceder = page.locator("xpath=//input[@value='Ingresar a Demo']");
    }

    // === Acciones ===
    public void ingresarUsuario(String usuario) {
        inputUsuario.fill(usuario);
    }

    public void ingresarPassword(String password) {
        inputPassword.fill(password);
    }

    public void hacerClickEnAcceder() {
        botonAcceder.click();
    }

    // === Acción completa de login ===
    public void login(String usuario, String password) {
        ingresarUsuario(usuario);
        ingresarPassword(password);
        hacerClickEnAcceder();
    }

    // === Validación simple de login exitoso ===
    public boolean loginExitoso() {
        return page.url().contains("dashboard");
    }

     public void navegarALogin() {
        page.navigate("https://qanovagroup.com/piloto"); // Reemplaza con tu URL real
    }
}
