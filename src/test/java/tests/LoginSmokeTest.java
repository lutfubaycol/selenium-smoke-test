package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import base.BaseTest;

public class LoginSmokeTest extends BaseTest {

    @Test
    @Tag("smoke")
    void loginShouldWork() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("tomsmith", "SuperSecretPassword!");
        Assertions.assertTrue(loginPage.isLoginSuccessful());
    }

    @Test
    @Tag("smoke")
    void loginShouldFailWithWrongCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("wrongUser", "wrongPass");
        Assertions.assertTrue(loginPage.isLoginFailed());
    }

    @Test
    @Tag("smoke")
    void loginAndLogoutShouldWork() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("tomsmith", "SuperSecretPassword!");
        Assertions.assertTrue(loginPage.isLoginSuccessful());

        loginPage.logout();
        Assertions.assertTrue(loginPage.isLogoutSuccessful());
    }
}