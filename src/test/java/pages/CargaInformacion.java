package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CargaInformacion {
    WebDriver driver;

    // 🔹 Locators
    private By campoTexto     = By.xpath("//*[@id='imObjectForm_1_2']");
    private By campoMail      = By.xpath("//*[@id='imObjectForm_1_3']");
    private By areaTexto      = By.xpath("//*[@id='imObjectForm_1_4']");
    private By campoFecha     = By.xpath("//*[@id='imObjectForm_1_5']");
    private By seleccion1     = By.xpath("//*[@id='imObjectForm_1_7_0']");
    private By seleccion2     = By.xpath("//*[@id='imObjectForm_1_7_1']");
    private By seleccion3     = By.xpath("//*[@id='imObjectForm_1_7_2']");
    private By radioCr1       = By.xpath("//*[@id='imObjectForm_1_8_0']");
    private By radioCr2       = By.xpath("//*[@id='imObjectForm_1_8_1']");
    private By radioCr3       = By.xpath("//*[@id='imObjectForm_1_8_2']");
    private By comboLista     = By.xpath("//*[@id='imObjectForm_1_6']");
    private By botonEnviar    = By.xpath("//*[@id='imObjectForm_1_submit']");
    private By botonReset     = By.xpath("//*[@id='imObjectForm_1_buttonswrap']/input[2]");

    // 🔹 Constructor
    public CargaInformacion(WebDriver driver) {
        this.driver = driver;
    }

    // 🔹 Métodos de acción

    public void ingresarTexto(String texto) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(campoTexto));
        System.out.println("Ingresando texto: " + texto);
        driver.findElement(campoTexto).sendKeys(texto);
    }

    public void ingresarMail(String email) {
        driver.findElement(campoMail).sendKeys(email);
    }

    public void ingresarAreaTexto(String texto) {
        driver.findElement(areaTexto).sendKeys(texto);
    }

    public void seleccionarFecha(String fecha) {
        driver.findElement(campoFecha).sendKeys(fecha);
    }

    public void seleccionarCheckbox1() {
        driver.findElement(seleccion1).click();
    }

    public void seleccionarCheckbox3() {
        driver.findElement(seleccion3).click();
    }

    public void seleccionarRadioCr2() {
        driver.findElement(radioCr2).click();
    }

    public void seleccionarDelCombo(String valor) {
        driver.findElement(comboLista).sendKeys(valor);
    }

    public void presionarBotonEnviar() {
        driver.findElement(botonEnviar).click();
    }

    public void presionarBotonReset() {
        driver.findElement(botonReset).click();
    }
}


