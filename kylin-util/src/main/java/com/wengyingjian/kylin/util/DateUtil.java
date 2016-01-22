/**
 * Copyright (c) 2015, 59store. All rights reserved.
 */
package com.wengyingjian.kylin.util;

import java.util.Calendar;

/**
 *
 * @author <a href="mailto:chenyb@59store.com">山人</a>
 * @version 1.0 15/11/6
 * @since 1.0
 */
public class DateUtil {

    /**
     * 根据Unix时间戳计算那一天开始的时间戳
     *
     * @param time
     *            给定任意一点时间, 精确到毫秒
     * @return 那一天开始的时间, 精确到秒
     */
    public static int getStartTimeOfOneDay(long time) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return (int) (cal.getTimeInMillis() / 1000);
    }

}
