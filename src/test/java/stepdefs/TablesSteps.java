package stepdefs;

import com.quandoo.resources.Base;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObjects.TablesPage;

import java.util.List;

public class TablesSteps extends Base {

    TablesPage tablesPageElements;

    private List namesAfterSort;

    @Before
    public void initElements() {
        tablesPageElements = PageFactory.initElements(driver, TablesPage.class);
    }

    //Background
    @Given("^I am on tables page URL \"([^\"]*)\"$")
    public void iAmOnTablesPageURL(String url) {
        driver.navigate().to(url);
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @Then("^I should see page \"([^\"]*)\" title$")
    public void iShouldSeeTablesTitle(String tablesTitle) {
        Assert.assertEquals(tablesTitle, tablesPageElements.tablesTitle.getText());
    }

    //Scenario
    @Given("^There is a non-empty column with last names$")
    public List thereIsAColumnWithLastNames() {
        //Get all names present in column
        List<String> namesBeforeSort = tablesPageElements.listLastNames(tablesPageElements.lastNames);
        Assert.assertTrue(!namesBeforeSort.isEmpty());

        //Sort names from allNames variable alphabetically (method dependent) and pass to public
        return namesAfterSort = tablesPageElements.sortList(namesBeforeSort);

    }

    @When("^I click on the \"([^\"]*)\" table header cell$")
    public void iClickOnTableHeaderCell(String cellName) {
        //Sort names on web page by clicking on table head
        tablesPageElements.performSort(tablesPageElements.tableHead(cellName));
    }

    @Then("^I should see the list sorted in ascending order$")
    public void iShouldSeeSortedList() {
        //Check if sorted names are equal to the sorted names displayed on page
        Assert.assertEquals(namesAfterSort, tablesPageElements.listLastNames(tablesPageElements.lastNames));
    }

}
