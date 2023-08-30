package DZ_23.login;


import DZ_23.abstraction.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(LOG_IN_BUTTON));
    }

    public WebElement getEMAIL_FILED() {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(EMAIL_FILED));
    }

    public WebElement getPASSWORD_FILED() {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(PASSWORD_FILED));
    }

    public WebElement getREGISTER_BUTTON() {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(REGISTER_BUTTON));
    }

    public WebElement getLOGOUT_BUTTON() {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(LOGOUT_BUTTON));
    }

    public WebElement getForgotPasswordButton() {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(FORGOT_PASSWORD_BUTTON));
    }

    public WebElement getSuccessfulLogin() {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESSFULL_LOGIN));
    }

    public WebElement getInvalidCredentials() {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(INVALID_CREDENTIALS));
    }

    public WebElement getPasswordRecoveryLink() {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(FORGOT_PASSWORD_ERROR));
    }
}
