package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import driverNavegador.DriverContext;
import driverNavegador.Navegador;

public class Hooks {

    @Before
    public void setUp() {
        DriverContext.setUp(Navegador.Chrome, "https://qanovagroup.com/piloto");
    }

    @After
    public void tearDown() {

        //DriverContext.closeDriver();
    }
}
