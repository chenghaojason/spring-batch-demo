package com.jason.batch.project.job.fixlength;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class MusicWrite implements ItemWriter<MusicModel> {

    private static final Logger logger = LoggerFactory.getLogger(MusicWrite.class);

    @Override
    public void write(List<? extends MusicModel> list) throws Exception {
        logger.info("读取数据量：[{}]", list.size());
    }
}
