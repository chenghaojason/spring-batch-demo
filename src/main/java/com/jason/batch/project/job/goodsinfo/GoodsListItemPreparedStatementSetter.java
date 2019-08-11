package com.jason.batch.project.job.goodsinfo;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.log4j.Logger;
import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

public class GoodsListItemPreparedStatementSetter implements ItemPreparedStatementSetter<GoodsListModel> {
    private static final Logger logger = Logger.getLogger(GoodsListItemPreparedStatementSetter.class);

    @Override
    public void setValues(GoodsListModel goodsListModel, PreparedStatement preparedStatement) throws SQLException {
        try {
            preparedStatement.setString(1, goodsListModel.getId());
            preparedStatement.setString(2, goodsListModel.getCreateUser());
            preparedStatement.setDate(3, new Date(DateUtils.parseDate(goodsListModel.getCreateTime(), "yyyy-MM-dd").getTime()));
            preparedStatement.setString(4, goodsListModel.getGoodsName());
            preparedStatement.setInt(5, (int) goodsListModel.getGoodsCount());
            preparedStatement.setDouble(6, goodsListModel.getGoodsPrice());
            preparedStatement.setString(7, goodsListModel.getGoodsDec());
            preparedStatement.setString(8, goodsListModel.getResource());
            preparedStatement.setString(9, goodsListModel.getGoodsType());
        } catch (ParseException e) {
            logger.error("日期解析异常:", e);

        }
    }
}
