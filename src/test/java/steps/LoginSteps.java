package steps;

import io.cucumber.java.en.*;
import pages.Login;
import hook.PlaywrightHook;

public class LoginSteps {

    Login login;

    @Given("el usuario accede a la página de login")
    public void acceder_a_pagina_login() {
        login = new Login(PlaywrightHook.page);
        login.navegarALogin();
    }

    @When("ingresa credenciales validas : usuario {string} y password {string}")
    public void ingresar_credenciales_validas(String usuario, String password) {
        login.login(usuario, password);
    }

    @Then("debería ver la pantalla principal del sistema")
    public void verifica_pantalla_principal() {
        boolean estaLogueado = login.loginExitoso();
        if (!estaLogueado) {
            throw new AssertionError("No se accedió correctamente al sistema");
        }
    }

    @Given("el usuario está logueado correctamente")
    public void el_usuario_esta_logueado_correctamente() {
        login = new Login(PlaywrightHook.page);
        login.navegarALogin();
        login.login("nvivas", "qanova");
    }
}
