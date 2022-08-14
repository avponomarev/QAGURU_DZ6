package components;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

public class CalendarComponents {
    public CalendarComponents setDate (String day, String month, String year){
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__year-select").click();
        if (Integer.valueOf(day) <= 9) {
            $(format(".react-datepicker__day--00%s", day)).click();
        } else {
            $(format(".react-datepicker__day--0%s", day)).click();
        }
        return this;
    }

}
