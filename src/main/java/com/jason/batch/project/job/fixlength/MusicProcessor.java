package com.jason.batch.project.job.fixlength;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class MusicProcessor implements ItemProcessor<MusicModel, MusicModel> {

    private static final Logger logger = LoggerFactory.getLogger(MusicProcessor.class);

    @Override
    public MusicModel process(MusicModel musicModel) throws Exception {
        logger.info("读取的数据：[{}]", musicModel.toString());
        return musicModel;
    }
}
