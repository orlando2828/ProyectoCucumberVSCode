package hook;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class PlaywrightHook {
    public static Playwright playwright;
    public static Browser browser;
    public static Page page;

    @Before
    public void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        page.navigate("https://qanovagroup.com/piloto"); // 🔁 Reemplaza por tu URL real
    }

    @After
    public void tearDown() {
      //  browser.close();
       // playwright.close();
    }
}




