package pages;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class RateYourHappinessModalPage {

    public static final String SLIDER_CSS = ".ui-slider-handle";
    public static final String UPDATE_MOOD_BUTTON = ".ButtonUpdate";
    public static final String TEXT_MESSAGE_CSS = ".UpdateMoodText";

    public MoodUpdatetModalPage updateMood(int moodVAlue, String message) {
        $(SLIDER_CSS).click();
        int defaultMoodValue = 5;
        Keys direction = null;
        if (moodVAlue > defaultMoodValue){
            direction = Keys.ARROW_RIGHT;
        } else if (moodVAlue < defaultMoodValue) {
            direction = Keys.ARROW_LEFT;
        }
        if (moodVAlue != defaultMoodValue){
            for (int i = 0; i < Math.abs(moodVAlue - defaultMoodValue); i++) {
                $(SLIDER_CSS).sendKeys(direction);
            }
        }
        $(TEXT_MESSAGE_CSS).sendKeys(message);
        $(UPDATE_MOOD_BUTTON).click();
        return new MoodUpdatetModalPage();
    }
}
