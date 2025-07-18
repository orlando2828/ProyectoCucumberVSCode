package hook;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class PlaywrightHook {
    public static Playwright playwright;
    public static Browser browser;
    public static Page page;

    @Before
    public void setup() throws InterruptedException{
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        page.navigate("https://qanovagroup.com/piloto"); // 🔁 Reemplaza por tu URL real
        Thread.sleep(10000); // Espera 10 segundos
    }

    @After
    public void tearDown() {
      //  browser.close();
       // playwright.close();
    }
}




