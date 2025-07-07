package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.Login;
import org.openqa.selenium.WebDriver;

import driverNavegador.DriverContext; // ajusta si tu clase se llama distinto

public class LoginSteps {
    WebDriver driver = driverNavegador.DriverContext.getDriver();
    Login login;

    @Given("el usuario accede a la página de login")
    public void acceder_a_pagina_login() {
        login = new Login(driver); //se instancia la page
    }

    @When("ingresa credenciales validas : usuario {string} y password {string}")
    public void ingresar_credenciales_validas(String usuario, String password) {
        login.login(usuario,password);
    }

    @Then("debería ver la pantalla principal del sistema")
    public void verifica_pantalla_principal() {
        boolean estaLogueado = login.loginExitoso();
        if (!estaLogueado) {
            throw new AssertionError("No se accedió correctamente al sistema");
        }

    }

    // 🆕 Nuevo step para usar en Background
    @Given("el usuario está logueado correctamente")
    public void el_usuario_esta_logueado_correctamente() {
        login = new Login(driver);
        login.login("nvivas", "qanova");
    }

}
