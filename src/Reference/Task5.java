package Reference;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Task5 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        switch (dayOfWeek){
            case FRIDAY:
                System.out.println("Today is friday");
                break;
            case MONDAY:
                System.out.println("Previous Friday was: " + date.minusDays(3));
                System.out.println("Next friday will be on: " + date.plusDays(4));
                break;
            case TUESDAY:
                System.out.println("Previous Friday was: " + date.minusDays(4));
                System.out.println("Next friday will be on: " + date.plusDays(3));
                break;
            case WEDNESDAY:
                System.out.println("Previous Friday was: " + date.minusDays(5));
                System.out.println("Next friday will be on: " + date.plusDays(2));
                break;
            case THURSDAY:
                System.out.println("Previous Friday was: " + date.minusDays(6));
                System.out.println("Next friday will be on: " + date.plusDays(1));
                break;
            case SATURDAY:
                System.out.println("Previous Friday was: " + date.minusDays(1));
                System.out.println("Next friday will be on: " + date.plusDays(6));
                break;
            case SUNDAY:
                System.out.println("Previous Friday was: " + date.minusDays(2));
                System.out.println("Next friday will be on: " + date.plusDays(5));
                break;
        }
    }
}
