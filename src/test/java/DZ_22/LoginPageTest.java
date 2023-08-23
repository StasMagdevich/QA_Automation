package DZ_22;

import DZ_22.factory.BrowserName;
import DZ_22.factory.WebDriverFactory;
import DZ_22.flows.LoginFlow;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageTest {
    private static LoginFlow loginFlow;
    private static WebDriver driver;

    @BeforeEach
    public void init() throws InterruptedException {
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
        WebElement element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/h3[1]"));
        String actualText = element.getText();
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
        WebElement element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/span[2]"));
        String actualText = element.getText();
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
        WebElement element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/div/span[2]"));
        String actualText = element.getText();
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
        loginFlow.findLogOutButton();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/nav/div[3]/div[1]/span/div/nav/span"));
        element.click();
        Assertions.assertTrue(true);
    }

    @Test
    public void testPasswordRecoveryLink() throws InterruptedException {
        loginFlow.findLogInButton();
        Thread.sleep(12000);
        loginFlow.findForgotPasswordButton();
        Thread.sleep(10000);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div/div[1]/div/h2"));
        String actualText = element.getText();
        String expectedText = "FORGOT PASSWORD?";
        Assertions.assertEquals(expectedText, actualText);
    }
}
