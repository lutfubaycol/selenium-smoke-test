package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

class BrowserSmokeTest {

    @Test
    void loginPageShouldOpen() {
        WebDriver driver = DriverFactory.createDriver();

        // Login sayfasına git
        driver.get("https://the-internet.herokuapp.com/login");

        // Sayfa başlığını al
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        // Basit assertion
        Assertions.assertEquals("The Internet", title);

        driver.quit();
    }
}