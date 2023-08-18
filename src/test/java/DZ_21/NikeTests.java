package DZ_21;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NikeTests {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.nike.com/");
    }

    @Test
    public void testSearchFunctionality() throws InterruptedException {
        WebElement searchInput = driver.findElement(By.cssSelector("input.pre-search-input"));
        WebElement searchButton = driver.findElement(By.cssSelector("button.pre-search-btn"));

        String searchQuery = "running shoes";
        searchInput.sendKeys(searchQuery);
        searchButton.click();
        Thread.sleep(3000);

        WebElement searchResultsHeader = driver.findElement(By.cssSelector("span.title_prefix"));
        Assert.assertTrue(searchResultsHeader.getText().contains("Search results for"), "Search results header doesn't match the expected text");
    }

    @Test
    public void testHomePageTitle() {
        String expectedTitle = "Welcome to Nike—Sign In";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Home page title doesn't match");
    }

    @Test
    public void testLogin() throws InterruptedException {
        WebElement inputLogin = driver.findElement(By.xpath("//*[@id=\"gen-nav-commerce-header-v2\"]/div[3]/div[1]/div/div/div[4]/div/button"));
        inputLogin.click();
        Thread.sleep(3000);
        inputLogin = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        inputLogin.sendKeys("mylogin@gmail.com");
        inputLogin = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/form/div/div[4]/button"));
        inputLogin.click();
        WebElement errorMessege = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/form/div/div[1]/div[2]"));

        Assertions.assertTrue(errorMessege.isDisplayed());
        //Assertions.assertEquals("We have encountered a problem. Please try again later.", errorMessege.getText());
    }

    @AfterAll
    public static void teardown(){
        driver.quit();
    }
}
