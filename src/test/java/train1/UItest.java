package train1;
import org.openqa.selenium.WebDriver;
import org.seleniumhq.jetty7.util.log.Log;

public class UItest {
    WebDriver driver;
    Log log = new Log();

    public WebDriver getDriver() {
        return driver;
    }

    /**
     * init test case
     * 
     * @param driver
     */
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void init(WebDriver driver) {
        log.info("Start WebDriver");
        setDriver(driver);
    }

    /**
     * stop webdriver
     * 
     * @param driver
     */
    public void stop() {
        log.info("Stop WebDriver");
        driver.quit();

    }
}