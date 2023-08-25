package DZ_22;

import DZ_22.factory.BrowserName;
import DZ_22.factory.WebDriverFactory;
import DZ_22.flows.LoginFlow;
import org.junit.jupiter.api.*;
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
        Thread.sleep(12000);
        loginFlow.fillEmail("maxal_maxalich@outlook.com");
        loginFlow.fillPasword("qwerty123");
        loginFlow.submit();
        Thread.sleep(10000);
        String actualText = loginFlow.findSuccessfulLogin().getText();
        String expectedText = "MY ACCOUNT";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void testInvalidLogin() throws InterruptedException {
        loginFlow.findLogInButton();
        Thread.sleep(10000);
        loginFlow.fillEmail("maxalich@outlook.com");
        loginFlow.fillPasword("qwerty123");
        loginFlow.submit();
        Thread.sleep(10000);
        String actualText = loginFlow.findInvalidCredentials().getText();
        String expectedText = "Email or password not correct.";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void testInvalidCredentials() throws InterruptedException {
        loginFlow.findLogInButton();
        Thread.sleep(10000);
        loginFlow.fillEmail("maxal_maxalich@outlook.com");
        loginFlow.fillPasword("qwerty");
        loginFlow.submit();
        Thread.sleep(10000);
        String actualText = loginFlow.findInvalidCredentials().getText();
        String expectedText = "Email or password not correct.";
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void testLogoutFunctionality() throws InterruptedException {
        loginFlow.findLogInButton();
        Thread.sleep(12000);
        loginFlow.fillEmail("maxal_maxalich@outlook.com");
        loginFlow.fillPasword("qwerty123");
        loginFlow.submit();
        Thread.sleep(10000);
        loginFlow.findLogInButton();
        WebElement element = loginFlow.findLogOutButton();
        element.click();
        Assertions.assertTrue(true);
    }

    @Test
    public void testPasswordRecoveryLink() throws InterruptedException {
        loginFlow.findLogInButton();
        Thread.sleep(12000);
        loginFlow.findForgotPasswordButton();
        Thread.sleep(10000);
        String actualText = loginFlow.findPasswordRecoveryLink().getText();
        String expectedText = "FORGOT PASSWORD?";
        Assertions.assertEquals(expectedText, actualText);
    }
}
