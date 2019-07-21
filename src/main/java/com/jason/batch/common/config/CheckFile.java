package com.jason.batch.common.config;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.core.io.Resource;
import org.springframework.util.Assert;

import java.io.File;

/**
 * 校验文件是否存在
 */
public class CheckFile implements Tasklet {

    private Resource resource;

    private static final Logger LOGGER = Logger.getLogger(CheckFile.class);

    private String path;

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {

        if(StringUtils.isNotBlank(path)){
            LOGGER.info("文件路径：" + path);
        }
        if (this.resource != null) {
            LOGGER.info("文件路径：" + this.resource.getURL());
        }

        if (null == this.resource && StringUtils.isEmpty(path)) {
            LOGGER.info("请指定文件路径");
            return setRes(stepContribution);
        }
        if (null != this.resource && StringUtils.isNotBlank(this.path)) {
            LOGGER.info("请指定一种文件配置路径");
            return setRes(stepContribution);
        }
        if (this.resource != null && !this.resource.exists()) {
            LOGGER.info("配置的resource文件不存在");
            return setRes(stepContribution);
        }

        if (StringUtils.isNotBlank(this.path)) {
            File file = new File(this.path);
            if (!file.exists()) {
                LOGGER.info("配置的path文件不存在");
                return setRes(stepContribution);
            }
        }
        stepContribution.setExitStatus(ExitStatus.COMPLETED);
        return RepeatStatus.FINISHED;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    private RepeatStatus setRes(StepContribution stepContribution){
        stepContribution.setExitStatus(ExitStatus.FAILED);
        return RepeatStatus.FINISHED;
    }
}
