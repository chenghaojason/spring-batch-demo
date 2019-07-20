package com.jason.batch.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    public static ApplicationContext getApplicationContext() {

        return applicationContext;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtil.applicationContext = applicationContext;
    }

    public static <T>T getBean(Class<T> tClass){
        return applicationContext.getBean(tClass);
    }

    public static Object getBean(String beanId){
        return applicationContext.getBean(beanId);
    }

    public static <T>T getBean(String beanId,Class<T> tClass){
        return applicationContext.getBean(beanId,tClass);
    }
}
