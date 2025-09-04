public class LeapYearCheck {
    public static void main(String[] args) {
        int year1 = 2024;
        int year2 = 1900;

        checkLeapYear(year1);
        checkLeapYear(year2);
    }

 public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}