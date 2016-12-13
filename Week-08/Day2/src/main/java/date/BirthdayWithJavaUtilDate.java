package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public final class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {

    public Date today = Calendar.getInstance().getTime();

    @Override
    public Date parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        Date date = null;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = df.parse(str);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return date;
    }

    @Override
    public String printMonthAndDay(Date date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        String formattedDate = null;
        formattedDate = new SimpleDateFormat("MM. dd.").format(date);
        return String.valueOf(formattedDate);
    }

    @Override
    public boolean isAnniversaryToday(Date date) {
        // TODO - return with true if today is the same month+day as date

        return printMonthAndDay(date).equals(printMonthAndDay(today));
    }

    @Override
    public int calculateAgeInYears(Date birthday) {
        // TODO - return how many years age the input date 'birthday' was

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int age;
       // age = year - birthday.get(Calendar.YEAR);
        //printMonthAndDay(birthday) (printMonthAndDay(today))

        return -1;
    }

    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        return -1;
    }

    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = parseDate(birthdayStr);
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