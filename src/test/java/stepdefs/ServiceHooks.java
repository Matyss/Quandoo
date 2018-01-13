package stepdefs;

import com.quandoo.resources.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class ServiceHooks extends Base {

    @Before
    public void initBrowser() throws IOException {
        driver = initDriver();
    }

    @After
    public void terminateSession() throws IOException {
        driver.close();
        driver = null;
    }
}
