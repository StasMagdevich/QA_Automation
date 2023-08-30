package DZ_23.flows;

import DZ_23.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFlow {
    private LoginPage loginPage;

    public LoginFlow(WebDriver webDriver) {
        this.loginPage = new LoginPage(webDriver);
    }

    public void fillEmail(String email) {
        loginPage.getEMAIL_FILED().clear();
        loginPage.getEMAIL_FILED().sendKeys(email);
    }

    public void fillPasword(String password) {
        loginPage.getPASSWORD_FILED().sendKeys(password);
    }

    public void findLogInButton() {
        loginPage.getLOG_IN_BUTTON().click();
    }

    public void submit() {
        loginPage.getREGISTER_BUTTON().click();
    }

    public WebElement findLogOutButton() {
        return loginPage.getLOGOUT_BUTTON();
    }

    public void findForgotPasswordButton() {
        loginPage.getForgotPasswordButton().click();
    }

    public WebElement findSuccessfulLogin() {
        return loginPage.getSuccessfulLogin();
    }

    public WebElement findInvalidCredentials() {
        return loginPage.getInvalidCredentials();
    }

    public WebElement findPasswordRecoveryLink() {
        return loginPage.getPasswordRecoveryLink();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }
}
