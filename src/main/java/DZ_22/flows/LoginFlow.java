package DZ_22.flows;

import DZ_22.LoginPage;
import org.openqa.selenium.WebDriver;

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

    public void findLogOutButton() {
        loginPage.getLOGOUT_BUTTON().click();
    }

    public void findForgotPasswordButton() {
        loginPage.getForgotPasswordButton().click();
    }
}
