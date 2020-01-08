package com.jason.batch.common.bean.response;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * Job相应
 *
 * @author ChenHol.Wong
 * @create 2019/12/16 - 21:57
 */
public class BatchResponse {
    private String jobName;
    private String filePath;
    private String fileName;
    private String jobInstance;
    private String jobState;
    private String responseTime;
    private String message;

    public static BatchResponse success(String jobName, String jobState,String jobInstance) {
        BatchResponse response = getInstance();
        response.setJobName(jobName);
        response.setJobState(jobState);
        response.setResponseTime(DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
        response.setMessage("job执行成功");
        response.setJobInstance(jobInstance);
        return response;
    }

    public static BatchResponse success(String jobName, String jobState) {
        BatchResponse response = getInstance();
        response.setJobName(jobName);
        response.setJobState(jobState);
        response.setResponseTime(DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
        response.setMessage("job执行成功");
        return response;
    }
    public static BatchResponse error(String jobName, String message) {
        BatchResponse response = getInstance();
        response.setJobName(jobName);
        response.setMessage(message);
        response.setResponseTime(DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
        return response;
    }
    public static BatchResponse getInstance(){
        return new BatchResponse();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getJobInstance() {
        return jobInstance;
    }

    public void setJobInstance(String jobInstance) {
        this.jobInstance = jobInstance;
    }

    public String isJobState() {
        return jobState;
    }

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getJobState() {
        return jobState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BatchResponse{" +
                "jobName='" + jobName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileName='" + fileName + '\'' +
                ", jobInstance='" + jobInstance + '\'' +
                ", jobState='" + jobState + '\'' +
                ", responseTime='" + responseTime + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
