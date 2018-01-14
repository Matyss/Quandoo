package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    //Webdriver declaration
    public WebDriver driver;

    //Page factory for page objects
    @FindBy(how = How.ID, using = "username")
    public WebElement usernameInput;

    @FindBy(how = How.ID, using = "password")
    public WebElement passwordInput;

    @FindBy(how = How.TAG_NAME, using = "button")
    public WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/h2")
    public WebElement loginTitle;

    @FindBy(how = How.ID, using = "flash")
    public WebElement alert;

    public String alertText(WebElement element) {
        String text = element.getText();
        for (WebElement child : element.findElements(By.xpath("./*"))) {
            text = text.replaceFirst(child.getText(), "").trim();
        }
        return text;
    }


    public void loginUser(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    //Constructor for webdriver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
}
