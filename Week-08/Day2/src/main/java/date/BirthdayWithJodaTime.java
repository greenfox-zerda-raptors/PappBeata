package date;

import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Scanner;

/**
 * Created by kicsen on 2016. 11. 30..
 */
public class BirthdayWithJodaTime implements BirthdayCalculator<LocalDate> {

    @Override
    public LocalDate parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd

        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        LocalDate dateTime = formatter.parseLocalDate(str);
        return dateTime;
    }

    @Override
    public String printMonthAndDay(LocalDate date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        DateTimeFormatter formatter = DateTimeFormat.forPattern("MM. dd.");
        String monthAndDay = date.toString(formatter);
        return monthAndDay;
    }

    @Override
    public boolean isAnniversaryToday(LocalDate date) {
        // TODO - return with true if today is the same month+day as date
        return printMonthAndDay(date).equals(printMonthAndDay(date.now()));
    }

    @Override
    public int calculateAgeInYears(LocalDate birthday) {
        // TODO - return how many years age the input date 'birthday' was
        int age;
        LocalDate dateNow = new LocalDate();
        try {
            Years ageY = Years.yearsBetween(birthday, dateNow);
            age = Integer.parseInt(ageY.toString());
            return age;
        } catch (Exception ex) {
            return 0;
        }
    }

    @Override
    public int calculateDaysToNextAnniversary(LocalDate date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)


        return -1;
    }

    public static void main(String[] args) {
        new BirthdayWithJodaTime().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        LocalDate birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");
}