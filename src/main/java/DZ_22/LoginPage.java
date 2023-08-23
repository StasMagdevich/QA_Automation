package DZ_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {
    private static final By LOG_IN_BUTTON = By.xpath("//*[@id=\"__next\"]/div/div[1]/nav/div[3]/div[1]/span/div/a");
    private static final By EMAIL_FILED = By.xpath("//*[@id=\"email\"]");
    private static final By PASSWORD_FILED = By.xpath("//*[@id=\"password\"]");
    private static final By REGISTER_BUTTON = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/form/div[3]/button");
    private static final By LOGOUT_BUTTON = By.xpath("//*[@id=\"__next\"]/div/div[1]/nav/div[3]/div[1]/span/div/a");
    private static final By FORGOT_PASSWORD_BUTTON = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/form/div[3]/a");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLOG_IN_BUTTON() {
        return driver.findElement(LOG_IN_BUTTON);
    }

    public WebElement getEMAIL_FILED() {
        return driver.findElement(EMAIL_FILED);
    }

    public WebElement getPASSWORD_FILED() {
        return driver.findElement(PASSWORD_FILED);
    }

    public WebElement getREGISTER_BUTTON() {
        return driver.findElement(REGISTER_BUTTON);
    }

    public WebElement getLOGOUT_BUTTON() {
        return driver.findElement(LOGOUT_BUTTON);
    }

    public WebElement getForgotPasswordButton() {
        return driver.findElement(FORGOT_PASSWORD_BUTTON);
    }
}
