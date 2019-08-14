package com.jason.batch.project.job.goodsinfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class GoodsListProcess implements ItemProcessor<GoodsListModel, GoodsListModel> {

    private static final Logger logger = LoggerFactory.getLogger(GoodsListProcess.class);

    @Override
    public GoodsListModel process(GoodsListModel goodsListModel) throws Exception {
        logger.info("商品信息：[{}]", goodsListModel.toString());
        return goodsListModel;
    }
}
