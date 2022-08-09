package components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CheckResult {
    public CheckResult checkText(String value) {
        $("#example-modal-sizes-title-lg").$(byText(value));

        return this;
    }

    public CheckResult checkValues(String lable, String value) {
        $(".table-responsive").$(byText(lable))
                .parent().shouldHave(text(value));

        return this;
    }

    public CheckResult checkButton(String value) {
        $(".modal-footer").$(byText(value));

        return this;
    }

}
