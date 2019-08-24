package com.jason.batch.common.config;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.JobParametersValidator;

/**
 * @description job参数校验器
 * @author: chenHoll.wang
 * @create: 2019-08-14 21:03
 **/
public class JobJasonParametersValidator implements JobParametersValidator {
    private static final Logger logger=LoggerFactory.getLogger(JobJasonParametersValidator.class);
    @Override
    public void validate(JobParameters jobParameters) throws JobParametersInvalidException {
        String jobName = jobParameters.getString("jobName");
        if(StringUtils.isEmpty(jobName)){
            logger.info("请选择要执行的job！");
        }
        if(!jobName.endsWith("Job")){
            logger.info("Job名必须以Job结束，请选择正确的Job");
        }
    }
}
