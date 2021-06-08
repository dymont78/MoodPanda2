package tests;

import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {

    public static final String LOGIN = "td78panda@mailinator.com";
    public static final String PASSWORD = "123456";

    @Test
    public void loginTest(){
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .waitForMoodButtonVisible()
                .clickOnUpdateButton()
                .updateMood(1);

    }
}
