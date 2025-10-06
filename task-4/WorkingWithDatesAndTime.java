import java.time.*;

public class WorkingWithDatesAndTime {

    public static void main(String[] args) {
        int year = 2025;
        int month = 10;
        LocalDate dateToCheck = LocalDate.of(2025, 6, 13);

        printMonthLengths(year);
        printMondays(year, month);
        checkFridayThe13th(dateToCheck);
    }

    // Task 1
    static void printMonthLengths(int year) {
        System.out.println("Length of each month in " + year + ":");
        for (int m = 1; m <= 12; m++) {
            YearMonth ym = YearMonth.of(year, m);
            System.out.println(ym.getMonth() + ": " + ym.lengthOfMonth() + " days");
        }
        System.out.println();
    }

    // Task 2
    static void printMondays(int year, int month) {
        System.out.println("Mondays in " + Month.of(month) + " " + year + ":");
        LocalDate date = LocalDate.of(year, month, 1);
        while (date.getMonthValue() == month) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
            date = date.plusDays(1);
        }
        System.out.println();
    }

    // Task 3
    static void checkFridayThe13th(LocalDate date) {
        System.out.print("Checking " + date + ": ");
        if (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13) {
            System.out.println("It's Friday the 13th!");
        } else {
            System.out.println("Not Friday the 13th.");
        }
    }
}
