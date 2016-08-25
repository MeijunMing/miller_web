package com.supermmj.www.tools;

import java.util.Calendar;
import java.util.Date;

/*******************************************************************************
 * Copyright (c) 2016 supermmj.com
 * <p>
 * All rights reserved.
 * <p>
 * Contributors:
 * Miller Ming - Initial implementation
 *******************************************************************************/
public class TimeUtils {

    /**
     * parameter Date type data and  0  return  2016-08-04  00:00:00
     * parameter Date type data and  1   2016-08-04  12:59:59
     */
    public static Date getStartOrEndTime(Date date, int flag) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        long millisecond = hour*60*60*1000 + minute*60*1000 + second*1000;
        //start time 00:00:00
        cal.setTimeInMillis(cal.getTimeInMillis()-millisecond);
        if (flag == 0) {
            return cal.getTime();
        } else if (flag == 1) {
            //end  time 23:59:59
            cal.setTimeInMillis(cal.getTimeInMillis()+23*60*60*1000 + 59*60*1000 + 59*1000);
        }
        return cal.getTime();
    }

}
