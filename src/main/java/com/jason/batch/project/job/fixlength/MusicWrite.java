package com.jason.batch.project.job.fixlength;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class MusicWrite implements ItemWriter<MusicModel> {

    private static final Logger LOGGER = Logger.getLogger(MusicWrite.class);

    @Override
    public void write(List<? extends MusicModel> list) throws Exception {
        LOGGER.info("读取数据量：" + list.size());
    }
}
