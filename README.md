# Java JalaliCalendar

Tiny library and class for Jalali Calendar in Java with Gregorian calendar convertor.

# Java Jalali Calendar

I did various searches. But I didn't find any simple libraries.

It can be said that this is one of the simplest libraries available.
Because its codes are clear and clear.

But other libraries are very complex and long.
Perhaps the algorithm used in this library might be better.

## Features

- Tiny and small code
- Convert gregorian calendar to jalali calendar
- Check Leap year
- Validation for jalali calendar


## Structure

```java
public JalaliCalendar();
public boolean isLeapYear();
public static boolean isLeapYear(int year){
public JalaliCalendar toJalali(int year, int month, int day){
public static JalaliCalendar gregorian2jalali(int year, int month, int day);
public void set(int year, int month, int day) throws Exception;
public boolean isValid();
public void setMonth(int month);
public void setYear(int year);
public void setDay(int day);
public int getMonth();
public int getYear();
public int getDay();
public String toString();
public boolean equals(JalaliCalendar o);
```

---------

# Max Base

My nickname is Max, Programming language developer, Full-stack programmer. I love computer scientists, researchers, and compilers.

## Asrez Team

A team includes some programmer, developer, designer, researcher(s) especially Max Base.

[Asrez Team](https://www.asrez.com/)
