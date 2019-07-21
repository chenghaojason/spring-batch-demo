package com.jason.batch.project.job.fixlength;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

public class MusicProcessor implements ItemProcessor<MusicModel,MusicModel> {

    private static final Logger LOGGER=Logger.getLogger(MusicProcessor.class);
    @Override
    public MusicModel process(MusicModel musicModel) throws Exception {
        LOGGER.info("读取的数据："+musicModel.toString());
        return musicModel;
    }
}
