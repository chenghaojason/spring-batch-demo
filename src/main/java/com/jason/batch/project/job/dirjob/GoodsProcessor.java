package com.jason.batch.project.job.dirjob;

import org.springframework.batch.item.ItemProcessor;

/**
 * 货物处理操作
 */
public class GoodsProcessor implements ItemProcessor<GoodsModel,GoodsModel> {
    @Override
    public GoodsModel process(GoodsModel goods) throws Exception {
        // 业务逻辑处理省略
        return goods;
    }
}
