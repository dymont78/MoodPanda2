package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyDiaryPage;

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
                .updateMood(9, "I am good!!!")
                .clickGoToMyDiaryButton();
        Assert.assertEquals(myDiaryPage.getRate(), "8");
        Assert.assertEquals(myDiaryPage.getTextMessage(), "I am good!!!");
    }
}
