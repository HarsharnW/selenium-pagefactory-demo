package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory
{
    private static WebDriver driver;

    public static void setDriver()
    {
        driver = com.maxsoft.webdrivermanager.driver.DriverFactory.getDriver("chrome");
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
