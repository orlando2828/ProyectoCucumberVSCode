package driverNavegador;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverContext {
    private static WebDriver driver;

    public static void setUp(Navegador navegador, String url) {
        if (navegador == Navegador.Chrome) {
            WebDriverManager.chromedriver().setup(); // Se encarga de descargar automáticamente el driver correcto
            driver = new ChromeDriver();
        } else if (navegador == Navegador.Edge) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
