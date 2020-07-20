package com.jason.batch.common.utils;

import com.jason.batch.common.exception.BatchException;

/**
 * @author ChenHol.Wong
 * @date 2020/7/12 12:18
 */
public class BatchAssert {

    public static void isNull(Object o) throws BatchException {
        if (o == null) {
            throw new BatchException("参数不能为空");
        }
    }

    public static void isNull(Object o, String message) throws BatchException {
        if (o == null) {
            throw new BatchException(message);
        }
    }

    public static void isNull(String str, String message) throws BatchException {
        if (str == null || str.trim().equals("")) {
            throw new BatchException(message);
        }
    }
}
