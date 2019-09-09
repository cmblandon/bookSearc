package co.com.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Drivers {
    private static WebDriver driver;
    private static String driverpath = "/Users/cristianmauricioblandon/Documents/proyectos/librerias/chromedriver";

    public static WebDriver web() {
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver useDriver() {
        return driver;
    }
}