package stepdefs;

import com.quandoo.resources.Base;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObjects.LoginPage;

import java.io.IOException;

public class LoginSteps extends Base {

    LoginPage loginPageElements;

    @Before
    public void initElements() throws IOException {
        driver = initDriver();
        loginPageElements = PageFactory.initElements(driver, LoginPage.class);
    }

    //Background
    @Given("^I am on \"([^\"]*)\" page on URL \"([^\"]*)\"$")
    public void i_am_on_page_on_URL(String title, String url) {
        driver.navigate().to(url);
        Assert.assertEquals(title, driver.getTitle());
    }

    @Then("^I should see title \"([^\"]*)\"$")
    public void i_should_see_title(String loginTitle) {
        Assert.assertEquals(loginTitle,loginPageElements.loginTitle.getText());
    }

    //Scenario
    @When("^I provide username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_provide_username_as_and_password_as(String username, String password) {
        Assert.assertTrue(loginPageElements.usernameInput.isDisplayed());
        Assert.assertTrue(loginPageElements.passwordInput.isDisplayed());
        loginPageElements.loginUser(username, password);
    }

    @And("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String btn) {
        Assert.assertTrue(loginPageElements.loginButton.isEnabled());
        Assert.assertEquals(loginPageElements.loginButton.getText(), btn);
        loginPageElements.loginButton.click();
    }

    @Then("^I should see alert message \"([^\"]*)\"$")
    public void i_should_see_alert_message(String message) {
        Assert.assertTrue(loginPageElements.alert.isDisplayed());
        Assert.assertEquals(message, loginPageElements.alertText(loginPageElements.alert));
    }

    @Then("^I should see \"([^\"]*)\" message$")
    public void i_should_see_message(String message) {
        Assert.assertTrue(loginPageElements.alert.isDisplayed());
        Assert.assertEquals(message, loginPageElements.alertText(loginPageElements.alert));
    }
}
