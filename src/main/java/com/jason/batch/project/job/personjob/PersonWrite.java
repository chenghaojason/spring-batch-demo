package com.jason.batch.project.job.personjob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class PersonWrite implements ItemWriter<PersonModel> {

    private static final Logger logger = LoggerFactory.getLogger(PersonWrite.class);

    @Override
    public void write(List<? extends PersonModel> list) throws Exception {
        logger.info("共读取：[{}] 条数据", list.size());
    }
}
