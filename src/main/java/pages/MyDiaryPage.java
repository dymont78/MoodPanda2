package pages;

import static com.codeborne.selenide.Selenide.*;

public class MyDiaryPage {

    public static final String MY_DIARY_PAGE_URL = "https://moodpanda.com/Feed/?Me=1";

    public String getRate(){
        return $$(".badge.pull-right").get(0).getText();
    }

    public String getTextMessage(){
        return $$(".MoodPostItem").get(0).getText();
    }

    public MyDiaryPage sendAHugButton(){
        $$(".ButtonHug").get(0).click();
        return this;
    }

    public MyDiaryPage openPage(){
        open(MY_DIARY_PAGE_URL);
        return new MyDiaryPage();
    }
    public  String getMessageFromMyHug(){
        String message = $(".p7674547.mcw1 .label-hug").getText();
        System.out.println(message);
        return message;
    }
}
