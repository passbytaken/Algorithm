package me.ele.napos.Utils;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by jakoo on 06/09/2017.
 */
public class DateUtils {


    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        while ( !now.getDayOfWeek().equals(DayOfWeek.THURSDAY)) {
            now = now.plusDays(1);
        }
        System.out.println(now);

    }


}
