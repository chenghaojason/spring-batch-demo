package com.jason.batch.common.utils;

import com.jason.batch.common.exception.BatchException;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

/**
 * @author ChenHol.Wong
 * @create 2020/7/12 12:00
 */
public class DateBatchUtil {

    private DateBatchUtil() {
    }

    public static final String FORMATE_DATE_01 = "yyyy-MM-dd";
    public static final String FORMATE_DATE_02 = "yyyy/MM/dd";
    public static final String FORMATE_DATE_03 = "yyyy年MM月dd日";


    public static boolean validDateString(String dateString) throws BatchException {
        return validDateString(dateString, FORMATE_DATE_01);
    }

    public static boolean validDateString(String dateString, String formate) throws BatchException {
        BatchAssert.isNull(dateString, "日期不能为空");
        try {
            Date date = DateUtils.parseDate(dateString, formate);
            String format = DateFormatUtils.format(date, formate);
            return dateString.equals(format);
        } catch (ParseException e) {
//            throw new BatchException(String.format("日期转化异常:-s% not pares -s%", dateString, formate), e);
            throw new BatchException("日期转化异常:", e);
        }
    }

    public static void main(String[] args) throws ParseException, BatchException {
        String format = DateFormatUtils.format(DateUtils.addDays(DateUtils.parseDate("2020-04-22", FORMATE_DATE_01), 90), FORMATE_DATE_01);
        System.out.println(format);

        System.out.println(validDateString("2020-02-02", FORMATE_DATE_02));

    }

}
