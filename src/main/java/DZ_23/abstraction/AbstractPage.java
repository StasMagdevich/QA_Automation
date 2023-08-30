package DZ_23.abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPage {

    private static final Duration timeout = Duration.ofMillis(10000);

    protected WebDriver driver;

    protected WebDriverWait driverWait;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver, timeout);
    }
}
