package stepdefs;

import com.quandoo.resources.Base;
import cucumber.api.java.After;

public class ServiceHooks extends Base {

    @After
    public void terminateSession() {
        driver.close();
        driver = null;
    }
}
