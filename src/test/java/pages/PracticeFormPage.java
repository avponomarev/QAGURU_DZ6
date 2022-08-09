package pages;

import components.CalendarComponents;
import components.CheckResult;
import components.StateAndCityComponent;


import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormPage {
    private CalendarComponents calendarComponents = new CalendarComponents();
    private StateAndCityComponent stateAndCityComponent = new StateAndCityComponent();
    private CheckResult checkResult = new CheckResult();


    public PracticeFormPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    public PracticeFormPage setFirstName(String value) {
        $("#firstName").setValue(value);
        return this;
    }

    public PracticeFormPage setLastName(String value) {
        $("#lastName").setValue(value);
        return this;
    }

    public PracticeFormPage setEmail(String value) {
        $("#userEmail").setValue(value);
        return this;
    }

    public PracticeFormPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;

    }

    public PracticeFormPage setNumber(String value) {
        $("#userNumber").setValue(value);
        return this;

    }

    public PracticeFormPage setBirthDay(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponents.setDate(day, month, year);
        return this;

    }

    public PracticeFormPage setSubject(String value) {
        $("#subjectsInput").setValue(value).pressEnter();
        return this;

    }

    public PracticeFormPage uploadFile(String value) {
        $("#uploadPicture").uploadFile(new File(value));
        return this;

    }

    public PracticeFormPage setHobbies(String value, String value1) {
        $("#hobbiesWrapper").$(byText(value)).click();
        $("#hobbiesWrapper").$(byText(value1)).click();
        return this;

    }

    public PracticeFormPage setAddress(String value) {
        $("#currentAddress").setValue(value);
        return this;

    }

    public PracticeFormPage setStateAndCity(String state, String city) {
        stateAndCityComponent.setStateAndCity(state, city);
        return this;

    }

    public PracticeFormPage checkText(String value) {
        $("#example-modal-sizes-title-lg").shouldHave(text(value));
        return this;

    }

    public PracticeFormPage checkResult(String key, String value) {
        checkResult.checkValues(key, value);
        return this;

    }

    public PracticeFormPage checkButton(String value) {
        $(".modal-footer").shouldHave(text(value));
        return this;

    }
}
