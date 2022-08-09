package components;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.files.DownloadActions.click;

public class CalendarComponents {
    public CalendarComponents setDate (String day, String month, String year){
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--0" + day ).click();
        return this;
    }

}
