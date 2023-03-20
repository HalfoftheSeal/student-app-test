import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentAppTest {
    WebDriver driver;
    private final String APP_URL = "http://acodemystudentapp-env.eba-d2vctp4d.eu-north-1.elasticbeanstalk.com/";
    @BeforeMethod
    public void initialize() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get(APP_URL);
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }
    @Test
    public void openStudentApp() {
        WebElement addStudentButton = driver.findElement(By.xpath("//div[@class='ant-table-title']//button"));
        addStudentButton.click();
        WebElement nameField= driver.findElement(By.id("name"));
        nameField.sendKeys("Bill Gates");
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("billgates@gmail.com");
        //    driver.findElement(By.xpath("//div[@class='ant-form-item-control-input-content']//button")).click();
    }
}
