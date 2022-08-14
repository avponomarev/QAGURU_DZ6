package ponomarev.andrei;

import com.codeborne.selenide.Configuration;
import dataTest.DataTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;


public class PracticeFormTest extends DataTest {
    PracticeFormPage practiceFormPage = new PracticeFormPage();

    @BeforeAll
    static void configure() {

        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
    }

    @Test
    void fillFormTest() {
        practiceFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(phoneNumber)
                .setBirthDay(day, month, year)
                .setSubject(subject)
                .setHobbies(hobbie)
                .uploadFile(file)
                .setAddress(currentAddress)
                .setStateAndCity(state, city)

                .checkText(checkText)
                .checkResult("Student Name", expectedFullName)
                .checkResult("Student Email", expectedEmail)
                .checkResult("Gender", expectedGender)
                .checkResult("Mobile", expectedPhoneNumber)
                .checkResult("Date of Birth", expectedDateOfBirth)
                .checkResult("Subjects", expectedSubject)
                .checkResult("Hobbies", expectedHobbie)
                .checkResult("Picture", expectedFile)
                .checkResult("Address", expectedCurrentAddress)
                .checkResult("State and City", expectedStateAndCity)
                .checkButton(checkButton);


    }
}
