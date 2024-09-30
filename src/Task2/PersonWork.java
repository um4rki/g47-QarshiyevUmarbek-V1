package Task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.*;


public class PersonWork {
    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(2019, 3, 1);
        LocalDate localDate2 = LocalDate.of(2024, 9, 30);

        int hour = 0;

        while (localDate2.isAfter(localDate1)) {
            DayOfWeek dayOfWeek = localDate1.getDayOfWeek();
            if (dayOfWeek == DayOfWeek.SATURDAY) {
                hour += 6;
            } else if (dayOfWeek == DayOfWeek.SUNDAY) {
                hour += 9;
            }
            localDate1 = localDate1.plusDays(1);
        }

        System.out.println(hour);
    }


}

