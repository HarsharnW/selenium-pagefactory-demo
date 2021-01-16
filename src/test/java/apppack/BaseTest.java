package apppack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static utils.DriverFactory.getDriver;
import static utils.DriverFactory.setDriver;

public class BaseTest
{
    protected WebDriver driver;

    @BeforeMethod
    public void before()
    {
        setDriver();
        driver = getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @AfterMethod
    public void closeDriver()
    {
        driver.quit();
    }
}
