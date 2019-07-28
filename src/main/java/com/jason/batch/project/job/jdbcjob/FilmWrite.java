package com.jason.batch.project.job.jdbcjob;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class FilmWrite implements ItemWriter<FilmModel> {

    private static final Logger logger = Logger.getLogger(FilmWrite.class);

    @Override
    public void write(List<? extends FilmModel> list) throws Exception {
        logger.info("此次共读取电影数据：" + list.size() + "条记录");

    }
}
