package org.CBDD.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.CBDD.core.TestContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebUtil extends TestContext {
    public static WebDriver initWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    public static void tearDown() {
        driver.quit();
    }}

