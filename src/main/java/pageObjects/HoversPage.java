package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public boolean checkVisibility(List<WebElement> avatars) {
        boolean isVisible = true;
        for (WebElement avatar : avatars) {
            Actions caption = new Actions(driver);
            caption.moveToElement(avatar).perform();
            WebElement cap = driver.findElement(By.xpath("//div[@class='figcaption']"));
            if(!cap.isDisplayed()) {
                isVisible = false;
            }
        }
        return isVisible;
    }

    //Constructor
    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }
}
