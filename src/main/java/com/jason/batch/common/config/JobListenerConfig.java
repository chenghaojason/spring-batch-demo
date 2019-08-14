package com.jason.batch.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.JobParameters;

/**
 * @description job监听器
 * @author: chenHoll.wang
 * @create: 2019-08-13 21:49
 **/
public class JobListenerConfig implements JobExecutionListener {

    private static final Logger logger = LoggerFactory.getLogger(JobListenerConfig.class);

    @Override
    public void beforeJob(JobExecution jobExecution) {
        String jobName = jobExecution.getJobInstance().getJobName();
        long instanceId = jobExecution.getJobInstance().getInstanceId();
        JobParameters jobParameters = jobExecution.getJobParameters();
        logger.info("Job监听器-job名：[{}],job实例ID：[{}]", jobName, instanceId);
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        logger.info("Job监听器-job：[{}] 执行结束,共耗时：[{}] ms", jobExecution.getJobInstance().getJobName(), getJobTimes(jobExecution));
    }

    private long getJobTimes(JobExecution jobExecution) {
        return jobExecution.getEndTime().getTime()-jobExecution.getStartTime().getTime();
    }
}
