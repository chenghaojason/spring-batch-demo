package com.jason.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:batch/*.xml", "classpath:batch/testBatch/*.xml", "classpath:batch/filejob/*.xml"})
public class BatchStartApplication {
    public static Logger logger = LoggerFactory.getLogger(BatchStartApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BatchStartApplication.class, args);
        logger.info(">>>>>>>>>>>>>>>> 跑批项目启动成功 <<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}