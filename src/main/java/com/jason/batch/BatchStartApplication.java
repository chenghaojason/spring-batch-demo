package com.jason.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Administrator
 */
@SpringBootApplication
@ImportResource(locations = {
        "classpath:batch/base/batch-*.xml",
        "classpath:batch/taskletjob/batch-*.xml",
        "classpath:batch/readjob/batch-*.xml",
        "classpath:batch/writejob/batch-*.xml"})
@PropertySource(value = "classpath:application-jobsql.properties")
public class BatchStartApplication {
    private static final Logger logger = LoggerFactory.getLogger(BatchStartApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BatchStartApplication.class, args);
        logger.info(">>>>>>>>>>>>>>>> 跑批项目启动成功 <<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
