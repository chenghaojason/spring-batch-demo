package com.jason.batch.project.job.personjob;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class PersonWrite implements ItemWriter<PersonModel> {

    private static final Logger LOGGER = Logger.getLogger(PersonWrite.class);

    @Override
    public void write(List<? extends PersonModel> list) throws Exception {
        LOGGER.info("共读取：" + list.size() + "条数据");
    }
}
