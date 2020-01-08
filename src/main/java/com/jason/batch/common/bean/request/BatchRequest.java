package com.jason.batch.common.bean.request;

/**
 * Job请求
 *
 * @author ChenHol.Wong
 * @create 2019/12/16 - 21:53
 */
public class BatchRequest {
    private String jobName;
    private String path;
    private String jobDay;
    private String beforeDay;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getJobDay() {
        return jobDay;
    }

    public void setJobDay(String jobDay) {
        this.jobDay = jobDay;
    }

    public String getBeforeDay() {
        return beforeDay;
    }

    public void setBeforeDay(String beforeDay) {
        this.beforeDay = beforeDay;
    }

    @Override
    public String toString() {
        return "BatchRequest{" +
                "jobName='" + jobName + '\'' +
                ", path='" + path + '\'' +
                ", jobDay='" + jobDay + '\'' +
                ", beforeDay='" + beforeDay + '\'' +
                '}';
    }
}
