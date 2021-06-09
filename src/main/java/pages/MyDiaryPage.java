package pages;

import static com.codeborne.selenide.Selenide.$$;

public class MyDiaryPage {

    public String getRate(){
        return $$(".badge.pull-right").get(0).getText();
    }

    public String getTextMessage(){
        return $$(".MoodPostItem").get(0).getText();
    }
}
