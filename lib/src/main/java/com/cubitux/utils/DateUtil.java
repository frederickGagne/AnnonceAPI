package com.cubitux.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Tools to perform date conversion
 *
 * @author pierre
 * @created 2016-05-26.
 */
public class DateUtil {

    /**
     * Custom date pattern
     */
    private static String dateFormat = "yyyy-MM-dd HH:mm:ss";

    /**
     * Convert a given Date into a String
     *
     * @param input the given date
     * @return The string represenation of it (Ex: 2016-05-26 13:00:00)
     */
    public static String dateToString(Date input) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        return simpleDateFormat.format(input);
    }


    /**
     * Convert a given String into a Date
     *
     * @param input String to be converted (Ex: 2016-05-26 13:00:00)
     * @return A Date object
     */
    public static Date stringToDate(String input) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        return simpleDateFormat.parse(input);
    }

}
