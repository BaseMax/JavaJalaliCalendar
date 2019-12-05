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
    }
}
