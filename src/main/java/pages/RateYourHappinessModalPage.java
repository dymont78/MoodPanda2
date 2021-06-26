package pages;

import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class RateYourHappinessModalPage {

    public static final String SLIDER_CSS = ".ui-slider-handle";
    public static final String UPDATE_MOOD_BUTTON = ".ButtonUpdate";
    public static final String TEXT_MESSAGE_CSS = ".UpdateMoodText";

    public MoodUpdatetModalPage updateMoodRate(int moodValue) {
        $(SLIDER_CSS).click();
        int defaultMoodValue = 5;
        Keys direction = null;
        if (moodValue > defaultMoodValue){
            direction = Keys.ARROW_RIGHT;
        } else if (moodValue < defaultMoodValue) {
            direction = Keys.ARROW_LEFT;
        }
        if (moodValue != defaultMoodValue){
            for (int i = 0; i < Math.abs(moodValue - defaultMoodValue); i++) {
                $(SLIDER_CSS).sendKeys(direction);
            }
        }
        $(UPDATE_MOOD_BUTTON).click();
        return new MoodUpdatetModalPage();
    }
    public MoodUpdatetModalPage updateMoodRateWithMessage(int moodValue, String message) {
        updateMoodRate(moodValue);
        $(TEXT_MESSAGE_CSS).sendKeys(message);
        $(UPDATE_MOOD_BUTTON).click();
        return new MoodUpdatetModalPage();
    }
    public MoodUpdatetModalPage updateMoodRateClick(int moodValue) {
        updateMoodRate(moodValue);
        $(UPDATE_MOOD_BUTTON).click();
        return new MoodUpdatetModalPage();
    }

}
