package me.ele.napos.Utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by jakoo on 06/09/2017.
 */
public class FindDateExample
{
    public static void main(String args[])
    {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int maxday =calendar.getActualMaximum(Calendar.DATE);
        for(int i=1;i<=maxday;i++)
        {
            calendar.set(Calendar.DATE, i);
            if(calendar.get(Calendar.DAY_OF_WEEK)==Calendar.THURSDAY)
            {
                System.out.println(String.valueOf(calendar.get(Calendar.DATE))+"是星期"
                        +(calendar.get(Calendar.DAY_OF_WEEK)-1));
            }
        }
    }
}
