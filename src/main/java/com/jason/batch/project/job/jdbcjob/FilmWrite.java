package com.jason.batch.project.job.jdbcjob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class FilmWrite implements ItemWriter<FilmModel> {

    private static final Logger logger = LoggerFactory.getLogger(FilmWrite.class);

    @Override
    public void write(List<? extends FilmModel> list) throws Exception {
        logger.info("此次共读取电影数据：[{}] 条记录", list.size());

    }
}
