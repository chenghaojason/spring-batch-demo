package com.jason.batch.project.job.dirjob;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class GoodsWrite implements ItemWriter<GoodsModel> {
    private static final Logger LOGGER = Logger.getLogger(GoodsWrite.class);

    @Override
    public void write(List<? extends GoodsModel> list) throws Exception {
        LOGGER.info("此次共处理了：" + list.size() + " 条数据");
    }
}
