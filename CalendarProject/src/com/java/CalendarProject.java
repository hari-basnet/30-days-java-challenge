package com.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarProject {

    public static void main(String[] args) {
	// write your code here
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 10);
        System.out.println(cal.getTime());
        
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }
}
