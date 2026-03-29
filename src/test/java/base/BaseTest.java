package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class BaseTest {

    protected WebDriver driver; // tüm testlerde kullanılacak

    @BeforeEach
    void setUp() {
        driver = DriverFactory.createDriver(); // Chrome aç
        driver.manage().window().maximize();   // tam ekran yap
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit(); // test bitince kapat
        }
    }
}