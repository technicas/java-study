package com.pyzn_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
工具类

构造方法私有
成员方法静态
 */
public class DateUtils {
    private DateUtils() {}

    /*
    把日期转换为指定格式的字符串
     */
    public static String dateToString(Date date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

        String stringDate = simpleDateFormat.format(date);
        return stringDate;
    }

    /*
    把指定格式字符串转换为日期
     */
    public static Date stringToDate(String s, String format) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date parse = simpleDateFormat.parse(s);
        return parse;
    }
}
