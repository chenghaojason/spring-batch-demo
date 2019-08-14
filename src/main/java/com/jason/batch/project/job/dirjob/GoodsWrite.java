package com.jason.batch.project.job.dirjob;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class GoodsWrite implements ItemWriter<GoodsModel> {
    private static final Logger logger = LoggerFactory.getLogger(GoodsWrite.class);

    @Override
    public void write(List<? extends GoodsModel> list) throws Exception {
        logger.info("此次共处理了：[{}]  条数据", list.size());
    }
}
