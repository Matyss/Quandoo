package stepdefs;

import com.quandoo.resources.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class ServiceHooks extends Base {

    @Before
    public void initElements() throws IOException {
        driver = initDriver();
        System.out.println("DRIVER INITIALIZED!!!");
    }

    @After
    public void terminateSession() {
        driver.close();
        driver = null;
    }
}
