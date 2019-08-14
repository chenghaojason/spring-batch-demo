package com.jason.batch.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

/**
 * @description 步step监听器
 * @author: chenHoll.wang
 * @create: 2019-08-13 21:11
 **/
public class StepJasonExecutionListener implements StepExecutionListener {
    private static final Logger logger = LoggerFactory.getLogger(StepJasonExecutionListener.class);

    @Override
    public void beforeStep(StepExecution stepExecution) {
        String stepName = stepExecution.getStepName();
        logger.info("step监听器-step：[{}]开始执行....", stepName);
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {

        logger.info("step监听器-step：[{}]执行结束", stepExecution.getStepName());
        return stepExecution.getExitStatus();
    }

}
