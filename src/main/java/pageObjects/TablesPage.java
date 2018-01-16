package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TablesPage {

    //WebDriver declaration
    public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(), 'Data Tables')]")
    public WebElement tablesTitle;

    @FindBy(how = How.XPATH, using = "//td[@class='last-name']")
    public List<WebElement> lastNames;

    public WebElement tableHead(String nameOfHead) {
        return driver.findElement(By.xpath("//table[@id='table2']//span[contains(text(), '"+nameOfHead+"')]"));
    }

    public List<String> listLastNames(List<WebElement> namesList) {
        ArrayList<String> names = new ArrayList<>();
        namesList.forEach(name -> {
            names.add(name.getText());
        });
        return names;
    }

    public List<String> sortList(List<String> unsortedList) {
        return unsortedList.stream().sorted().collect(Collectors.toList());
    }

    public List<String> reverseList(List<String> sortedList) {
        ArrayList<String> someList = new ArrayList<>();
        Collections.reverse(sortedList);
        return someList;
    }

    public void performSort(WebElement tableRowCell) {
        tableRowCell.click();
    }


    //Constructor
    public TablesPage(WebDriver driver) {
        this.driver = driver;
    }
}
