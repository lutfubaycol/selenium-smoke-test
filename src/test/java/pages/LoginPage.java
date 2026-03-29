package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locators
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By successMessage = By.cssSelector("#flash");
    private By errorMessage = By.cssSelector("#flash");
    private By logoutButton = By.cssSelector(".icon-2x.icon-signout");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Sayfayı aç
    public void open() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    // Login işlemi
    public void login(String user, String pass) {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }

    // Başarılı login kontrolü
    public boolean isLoginSuccessful() {
        return driver.findElement(successMessage).getText().contains("You logged into a secure area!");
    }

    // Başarısız login kontrolü
    public boolean isLoginFailed() {
        return driver.findElement(errorMessage).getText().contains("Your username is invalid!");
    }

    // Logout işlemi
    public void logout() {
        driver.findElement(logoutButton).click();
    }

    // Logout başarılı mı?
    public boolean isLogoutSuccessful() {
        return driver.getTitle().equals("The Internet");
    }
}