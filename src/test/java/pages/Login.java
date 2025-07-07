package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {


    private WebDriver driver;

    // === Localizadores ===
    private By inputUsuario = By.id("imUname");
    private By inputPassword = By.id("imPwd");
    private By botonAcceder = By.xpath("//input[@value ='Ingresar a Demo']");

    // === Constructor ===
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    // === Acciones ===
    public void ingresarUsuario(String usuario) {
        driver.findElement(inputUsuario).clear();
        driver.findElement(inputUsuario).sendKeys(usuario);
    }

    public void ingresarPassword(String password) {
        driver.findElement(inputPassword).clear();
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void hacerClickEnAcceder() {
        driver.findElement(botonAcceder).click();
    }

    // === Acción completa de login ===
    public void login(String usuario, String password) {
        ingresarUsuario(usuario);
        ingresarPassword(password);
        hacerClickEnAcceder();
    }

    // === Validación simple de login exitoso ===
    public boolean loginExitoso() {
        return driver.getCurrentUrl().contains("dashboard");
    }
}




