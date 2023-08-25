package DZ_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {
    private static final By LOG_IN_BUTTON = By.xpath("//a[@data-qa='DesktopNavigationAccountMenu']");
    private static final By EMAIL_FILED = By.xpath("//*[@id=\"email\"]");
    private static final By PASSWORD_FILED = By.xpath("//*[@id=\"password\"]");
    private static final By REGISTER_BUTTON = By.xpath("//button[@data-qa='PrimaryLoginButton']");
    private static final By LOGOUT_BUTTON = By.xpath("//span[@data-qa='DesktopNavigationAccountMenuSignOutLink']");
    private static final By FORGOT_PASSWORD_BUTTON = By.xpath("//a[@data-qa='LoginForgotPasswordLink']");
    private static final By SUCCESSFULL_LOGIN = By.xpath("//*[@data-qa='MyAccountHeader']");
    private static final By INVALID_CREDENTIALS = By.xpath("//span[@data-qa='LoginErrorTopPage']");
    private static final By FORGOT_PASSWORD_ERROR = By.xpath("//*[@data-qa='ForgotPasswordSectionTitle']");

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

    public WebElement getSuccessfulLogin() {
        return driver.findElement(SUCCESSFULL_LOGIN);
    }

    public WebElement getInvalidCredentials() {
        return driver.findElement(INVALID_CREDENTIALS);
    }

    public WebElement getPasswordRecoveryLink() {
        return driver.findElement(FORGOT_PASSWORD_ERROR);
    }
}
