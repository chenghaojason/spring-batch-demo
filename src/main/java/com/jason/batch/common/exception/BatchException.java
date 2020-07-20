package com.jason.batch.common.exception;

/**
 * @author ChenHol.Wong
 * @create 2020/7/12 12:13
 */
public class BatchException extends Exception {

    public BatchException() {
        super();
    }

    public BatchException(String message) {
        super(message);
    }

    public BatchException(String message, Throwable e) {
        super(message, e);
    }

}
