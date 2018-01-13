package stepdefs;

import com.quandoo.resources.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps extends Base {

    @Given("^I am on \"([^\"]*)\" page on URL \"([^\"]*)\"$")
    public void i_am_on_page_on_URL(String title, String url) {
        driver.navigate().to(url);
        Assert.assertEquals(title, driver.getTitle());
    }

    @Then("^I should see title \"([^\"]*)\"$")
    public void i_should_see_title(String loginTitle) {
        Assert.assertEquals(loginTitle, "Login Page");
    }

    @When("^I provide \"([^\"]*)\" as \"([^\"]*)\"$")
    public void i_provide_as(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see alert message \"([^\"]*)\"$")
    public void i_should_see_alert_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see \"([^\"]*)\" message$")
    public void i_should_see_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
