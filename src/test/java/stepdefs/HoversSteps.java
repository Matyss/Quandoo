package stepdefs;

import com.quandoo.resources.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObjects.HoversPage;

public class HoversSteps extends Base {

    HoversPage hoversPageElements;

    @Before
    public void initElements() {
        hoversPageElements = PageFactory.initElements(driver, HoversPage.class);
    }

    //Background
    @Given("^I am on avatars page URL \"([^\"]*)\"$")
    public void iAmOnAvatarsPageURL(String url) {
        driver.navigate().to(url);
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @Then("^I should see \"([^\"]*)\" title$")
    public void iShouldSeeTitle(String hoversTitle) {
        Assert.assertEquals(hoversTitle, hoversPageElements.hoversTitle.getText());
    }


    @Given("^There are (\\d+) avatars on the page$")
    public void thereAreAvatarsOnThePage(int avatarsNum) {
        Assert.assertEquals(avatarsNum, hoversPageElements.avatarList.size());
    }

    @When("^I hover over the avatar number")
    public void iHoverOverTheAvatar() throws InterruptedException {
//        hoversPageElements.avatarList.forEach(item -> System.out.println(item.getAttribute("textContent").trim()));
        Assert.assertTrue(hoversPageElements.checkVisibility(hoversPageElements.avatarList));
    }

    @Then("^I should see caption \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iShouldSeeCaptionAnd(String arg0, String arg1) {
        System.out.println("habla");
    }
}
