package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {

    public static final String LOGIN = "td78panda@mailinator.com";
    public static final String PASSWORD = "123456";

    @Test(description = "Test change my rate")
    public void changeRateTest(){
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .waitForMoodButtonVisible()
                .clickOnUpdateButton()
                .updateMoodRateClick(9)
                .clickGoToMyDiaryButton();
        Assert.assertEquals(myDiaryPage.getRate(), "9");
    }

    @Test(description = "Test change message")
    public void changeMessageTest(){
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .waitForMoodButtonVisible()
                .clickOnUpdateButton()
                .updateMoodRateWithMessage(9, "I am good!!!")
                .clickGoToMyDiaryButton();
        Assert.assertEquals(myDiaryPage.getTextMessage(), "I am good!!!");
    }

    @Test(description = "Send a hug test")
    public void sendAHugTest(){
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .waitForMoodButtonVisible();
        myDiaryPage
                .openPage()
                .sendAHugButton();
        Assert.assertEquals(myDiaryPage.getMessageFromMyHug(), "🐼Hugs - You");
    }
}