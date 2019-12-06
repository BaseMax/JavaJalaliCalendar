package com.asrez;
import com.asrez.utils.JalaliCalendar;

public class main {
    public static void main(String[] args) {
        JalaliCalendar date=new JalaliCalendar();
        try {
            date.set(1501,12,31);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(""); //////////////////////////////

        try {
            date.set(1501,12,30);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(""); //////////////////////////////

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDay());

        System.out.println(""); //////////////////////////////

        date=JalaliCalendar.gregorian2jalali(2019, 12, 5);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDay());
        System.out.println(date.isLeapYear());

        System.out.println(""); //////////////////////////////

        date=date.toJalali(2019,12,12);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDay());

        System.out.println(""); //////////////////////////////

        System.out.println(date);

        System.out.println(""); //////////////////////////////

        System.out.println(JalaliCalendar.daysOfMonth(1398,1));//31
        System.out.println(JalaliCalendar.daysOfMonth(1398,11));//30
        System.out.println(JalaliCalendar.daysOfMonth(1398,12));//29
        System.out.println(JalaliCalendar.daysOfYear(1398));//365
        System.out.println(JalaliCalendar.daysOfYear(1397));//365
        System.out.println(JalaliCalendar.daysOfYear(1396));//365
        System.out.println(JalaliCalendar.daysOfYear(1395));//366
        System.out.println(JalaliCalendar.daysOfYearUntilMonth(1395,4));//124
        System.out.println(JalaliCalendar.daysOfYearUntilMonth(1395,11));//336
        System.out.println(JalaliCalendar.daysOfYearUntilDay(1395,150));//124
        System.out.println(JalaliCalendar.daysOfYearUntilDay(1395,124));//124
        System.out.println(JalaliCalendar.daysOfYearUntilDay(1395,125));//124
        System.out.println(JalaliCalendar.daysOfYearUntilDay(1395,123));//93
    }
}
