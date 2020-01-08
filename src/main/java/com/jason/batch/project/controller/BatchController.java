package com.jason.batch.project.controller;

import com.jason.batch.common.bean.request.BatchRequest;
import com.jason.batch.common.bean.response.BatchResponse;
import com.jason.batch.common.utils.SpringUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author wangchengjason
 */
@RestController
@RequestMapping("/jobHome")
public class BatchController {

    public static final Logger logger = LoggerFactory.getLogger(BatchController.class);


    @GetMapping("/startJob")
    public BatchResponse startJob(BatchRequest request) {
        String jobName = request.getJobName();
        JobLauncher jobLauncher = SpringUtil.getBean("jobLauncher", JobLauncher.class);
        if (StringUtils.isBlank(jobName)) {
            return BatchResponse.error(jobName, "请选择job");
        }
        Job job = SpringUtil.getBean(jobName, Job.class);

        JobParametersBuilder parametersBuilder = new JobParametersBuilder();
        parametersBuilder.addString("jobName", jobName);
        parametersBuilder.addDate("jobStartTime", new Date());
        JobParameters jobParameters = parametersBuilder.toJobParameters();
        JobExecution run;
        try {
            run = jobLauncher.run(job, jobParameters);
            logger.info("JOB执行信息：[{}]", run.getJobInstance());
        } catch (Exception e) {
            logger.error("job执行失败:", e);
            return BatchResponse.error(jobName, e.getMessage());
        }
        return BatchResponse.success(jobName, run.getExitStatus().getExitCode(), run.getJobInstance().getInstanceId() + "");
    }
}
