package com.pyzn_02;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        String s = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);

        String format = "yyyy年MM月dd日 HH:mm:ss";
        String date = "2019年08月09日 10:20:01";
        Date date1 = DateUtils.stringToDate(date, format);
        System.out.println(date1);
    }
}
