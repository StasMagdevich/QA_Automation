package DZ_23;

import DZ_23.factory.BrowserName;
import DZ_23.factory.WebDriverFactory;
import DZ_23.flows.LoginFlow;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageTest {
    private static LoginFlow loginFlow;
    private static WebDriver driver;

    @BeforeEach
    public void init() {
        driver = WebDriverFactory.getByName(BrowserName.CHROME);
        loginFlow = new LoginFlow(driver);
        driver.manage().window().maximize();
        driver.get("https://www.flightclub.com/");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testSuccessfulLogin() throws InterruptedException {
        loginFlow.findLogInButton();
        loginFlow.fillEmail("maxal_maxalich@outlook.com");
        loginFlow.fillPasword("qwerty123");
        loginFlow.submit();
        WebElement validLoginElement = loginFlow.findSuccessfulLogin();
        String actualText = loginFlow.getTextFromElement(validLoginElement);
        String expectedText = "MY ACCOUNT";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void testInvalidLogin() throws InterruptedException {
        loginFlow.findLogInButton();
        loginFlow.fillEmail("maxalich@outlook.com");
        loginFlow.fillPasword("qwerty123");
        loginFlow.submit();
        WebElement invalidLoginElement = loginFlow.findInvalidCredentials();
        String actualText = loginFlow.getTextFromElement(invalidLoginElement);
        String expectedText = "Email or password not correct.";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void testInvalidCredentials() throws InterruptedException {
        loginFlow.findLogInButton();
        loginFlow.fillEmail("maxal_maxalich@outlook.com");
        loginFlow.fillPasword("qwerty");
        loginFlow.submit();
        WebElement invalidLoginElement = loginFlow.findInvalidCredentials();
        String actualText = loginFlow.getTextFromElement(invalidLoginElement);
        String expectedText = "Email or password not correct.";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void testLogoutFunctionality() throws InterruptedException {
        loginFlow.findLogInButton();
        loginFlow.fillEmail("maxal_maxalich@outlook.com");
        loginFlow.fillPasword("qwerty123");
        loginFlow.submit();
        loginFlow.findLogInButton();
        WebElement element = loginFlow.findLogOutButton();
        element.click();
        Assertions.assertTrue(true);
    }

    @Test
    public void testPasswordRecoveryLink() throws InterruptedException {
        loginFlow.findLogInButton();
        loginFlow.findForgotPasswordButton();
        WebElement recoveryElement = loginFlow.findPasswordRecoveryLink();
        String actualText = loginFlow.getTextFromElement(recoveryElement);
        String expectedText = "FORGOT PASSWORD?";
        Assertions.assertEquals(expectedText, actualText);
    }
}
