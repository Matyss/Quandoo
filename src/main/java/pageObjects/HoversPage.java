package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HoversPage {

    //Webdriver declaration
    public WebDriver driver;

    @FindBy(how = How.XPATH, using = "//div[@class='example']/h3")
    public WebElement hoversTitle;

    @FindBy(how = How.CLASS_NAME, using = "figure")
    public List <WebElement> avatarList;

    @FindBy(how = How.XPATH, using = "//div[@class='figcaption']/h5")
    public List <WebElement> captionList;

    public List avatarsList() {
        return driver.findElements(By.className("figure"));
    }

    //Constructor
    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }
}
