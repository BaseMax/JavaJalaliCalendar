package com.asrez.utils;
/**
 *
 * @Name : JavaJalaliCalendar
 * @File : com/asrez/utils/JalaliCalendar.java
 * @Version : 1.0
 * @Programmer : Max
 * @Date : 2019-12-01
 * @Released under : https://github.com/BaseMax/JavaJalaliCalendar/blob/master/LICENSE
 * @Repository : https://github.com/BaseMax/JavaJalaliCalendar
 * @Reference : https://github.com/BaseMax/ConvertCalendar
 *
 **/
//import java.time.LocalDate;
//import java.time.ZoneId;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
/**
 * Some complex repository about this:
 * https://github.com/razeghi71/JalaliCalendar
 * https://github.com/eloyzone/jalali-calendar
 * http://icu-project.org/~yoshito/jacoco_57.1/com.ibm.icu.util/PersianCalendar.java.html
 * And another way:
 * ULocale locale = new ULocale("fa_IR@calendar=persian");
 */
public class JalaliCalendar {
    private int year, month, day;

    public JalaliCalendar() {
    }

    public boolean isLeapYear(){
        return isLeapYear(this.year);
    }

    public static boolean isLeapYear(int year){
        return year%4==3 ? true : false;
    }

    public JalaliCalendar toJalali(int year, int month, int day){
        return gregorian2jalali(year, month, day);
    }

    public static JalaliCalendar gregorian2jalali(int year, int month, int day) {
        JalaliCalendar result=new JalaliCalendar();
        int array[]={0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        if(year<=1600) {
            year-=621;
            result.year=0;
        }
        else {
            year-=1600;
            result.year=979;
        }
        int temp=(year>2)?(year+1):year;
        int days=((int)((temp+3)/4)) + (365*year) - ((int)((temp+99)/100)) - 80 + array[month-1] + ((int)((temp+399)/400)) + day;
        result.year+=33*((int)(days/12053));
        days%=12053;
        result.year+=4*((int)(days/1461));
        days%=1461;
        if(days > 365){
            result.year+=(int)((days-1)/365);
            days=(days-1)%365;
        }
        result.month=(days < 186)?1+(int)(days/31):7+(int)((days-186)/30);
        result.day=1+((days < 186)?(days%31):((days-186)%30));
        return result;
    }

    public void set(int year, int month, int day) throws Exception {
        setYear(year);
        setMonth(month);
        setDay(day);
        if(!isValid()) {
            throw new Exception("The Date is not valid!");
        }
    }

    public boolean isValid() {
        if(month > 12 || month < 1) {
            return false;
        }
        if(day > 31 || day < 1) {
            return false;
        }
        if(month <= 6 && day > 31) {
            return false;
        }
        if(month <= 11 && month > 6 && day > 30) {
            return false;
        }
        if(month == 12) {
            if(isLeapYear(year) == true) {
                if(day > 30) {
                    return false;
                }
            }
            else {
                if(day > 29) {
                    return false;
                }
            }
        }
        // if(year > 1400) {
        // 	return false;
        // }
        // if(year < 1300) {
        // 	return false;
        // }
        return true;
    }

    public void setMonth(int month) {
        this.month = month;
        // You can check it with isValid()...
    }

    public void setYear(int year) {
        this.year = year;
        // You can check it with isValid()...
    }

    public void setDay(int day) {
        this.day = day;
        // You can check it with isValid()...
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return new String(this.year + "/"+this.month+"/"+this.day);
    }

    public boolean equals(JalaliCalendar o) {
        if(o.year == this.year && o.month == this.month && o.day == this.day) {
            return true;
        }
        return false;
    }
}
