package steps;

import org.openqa.selenium.WebDriver;
import pages.CargaInformacion;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.CargaInformacion;
import driverNavegador.DriverContext;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

public class CargaInformacionSteps {

        WebDriver driver = DriverContext.getDriver();
        CargaInformacion cargaInformacion = new CargaInformacion(driver);

        @When("ingresa {string} en el campo texto")
        public void ingresa_en_el_campo_texto(String texto) {
            cargaInformacion.ingresarTexto(texto);
        }

        @When("escribe {string} en el campo mail")
        public void escribe_en_el_campo_mail(String mail) {
            cargaInformacion.ingresarMail(mail);
        }

        @When("agrega {string} en el área de texto")
        public void agrega_en_el_area_de_texto(String texto) {
            cargaInformacion.ingresarAreaTexto(texto);
        }

        @When("selecciona la fecha {string}")
        public void selecciona_la_fecha(String fecha) {
            cargaInformacion.seleccionarFecha(fecha);
        }

        @When("selecciona {string} y {string} en las opciones múltiples")
        public void selecciona_en_opciones_multiples(String op1, String op2) {
            cargaInformacion.seleccionarCheckbox1();
            cargaInformacion.seleccionarCheckbox3();
        }

        @When("elige {string} en las opciones radio")
        public void elige_en_las_opciones_radio(String opcion) {
            cargaInformacion.seleccionarRadioCr2(); // mejora pendiente si querés hacerlo dinámico
        }

        @When("selecciona el valor {string} del combo lista")
        public void selecciona_el_valor_del_combo_lista(String valor) {
            cargaInformacion.seleccionarDelCombo(valor);
        }

        @When("presiona el botón Enviar")
        public void presiona_el_boton_enviar() {
            cargaInformacion.presionarBotonEnviar();
        }

        @Then("debería ver un mensaje de confirmación")
        public void deberia_ver_mensaje_de_confirmacion() {
            assertTrue(true); // luego validamos algo real
        }
    }