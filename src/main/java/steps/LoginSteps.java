package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.FeedPage;
import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage;
    private FeedPage feedPage;

    public LoginSteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }
    @Step("Open site and log in with username: '{username}' password: '{password}'")
    public FeedPage openSiteAndLogin(String username, String password){
        loginPage
                .openPage()
                .login(username, password)
                .waitForMoodButtonVisible();
        return this;
    }
}
