package dataTest;

import com.github.javafaker.Faker;

import static java.lang.String.format;

public class DataTest {

    static Faker faker = new Faker();

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String phoneNumber = faker.phoneNumber().subscriberNumber(10);


    public String day = faker.number().numberBetween(1, 31) + "";

    public String month = "July";

    public String year = faker.number().numberBetween(1950, 2001) + "";

    public String gender = "Male";
    public String subject = "Economics";
    public String hobbie = "Reading";
    public String file = "src/test/resources/PracticeForm/test.jpg";
    public String currentAddress = faker.address().fullAddress();
    public String state = "Haryana";
    public String city = "Karnal";


    public String checkText = "Thanks for submitting the form";
    public String expectedFullName = format("%s %s", firstName, lastName);
    public String expectedEmail = email;
    public String expectedGender = gender;
    public String expectedPhoneNumber = phoneNumber;
    public String expectedDateOfBirth = format("%s %s,%s", day, month, year);
    public String expectedSubject = subject;
    public String expectedHobbie = hobbie;
    public String expectedFile = "test.jpg";
    public String expectedCurrentAddress = currentAddress;

    public String expectedStateAndCity = format("%s %s", state, city);
    public String checkButton = "Close";
}
