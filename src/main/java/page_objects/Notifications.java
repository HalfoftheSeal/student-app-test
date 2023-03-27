package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Notifications {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public Notifications(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.CLASS_NAME, using = "ant-notification-notice-message")
    WebElement notificationMessage;
    @FindBy(how = How.CLASS_NAME, using = "ant-notification-notice-description")
    WebElement notificationDescription;
    @FindBy(how = How.CLASS_NAME, using = "ant-notification-notice-close")
    WebElement popUpCloseButton;
    public WebElement getPopUpCloseButton() {
        return popUpCloseButton;
    }
    public String getMessageFromNotification() {
        webDriverWait.until(ExpectedConditions.visibilityOf(notificationMessage));
        return notificationMessage.getText();
    }

    public String getDescriptionFromNotification() {
        webDriverWait.until(ExpectedConditions.visibilityOf(notificationDescription));
        return notificationDescription.getText();
    }
}
