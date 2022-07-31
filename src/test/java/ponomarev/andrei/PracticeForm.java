package ponomarev.andrei;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeForm {
    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Andrei");
        $("#lastName").setValue("Ponomarev");
        $("#userEmail").setValue("test@gmail.com");
        $("#userEmail").setValue("test@gmail.com");
        $("[for=gender-radio-1]").click();
        $("#userNumber").setValue("9999999999");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(0);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOptionContainingText("1970");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--001").click();
        $("#subjectsInput").setValue("Economics").pressEnter();
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-3]").click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/PracticeForm/test.jpg"));
        $("#currentAddress").setValue("Moscow");
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".modal-body").shouldHave(text("Andrei Ponomarev"));
        $(".modal-body").shouldHave(text("test@gmail.com"));
        $(".modal-body").shouldHave(text("Male"));
        $(".modal-body").shouldHave(text("9999999999"));
        $(".modal-body").shouldHave(text("01 January,1970"));
        $(".modal-body").shouldHave(text("Economics"));
        $(".modal-body").shouldHave(text("Sports, Music"));
        $(".modal-body").shouldHave(text("test.jpg"));
        $(".modal-body").shouldHave(text("Moscow"));
        $(".modal-body").shouldHave(text("Haryana Karnal"));
        $(".modal-footer").shouldHave(text("Close"));
    }
}
