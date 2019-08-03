package com.jason.batch.project.job.goodsinfo;

import java.util.Date;

public class GoodsListModel {
    private String id;
    private String createUser;
    private String createTime;
    private String goodsName;
    private long goodsCount;
    private double goodsPrice;
    private String goodsType;
    private String goodsDec;
    private String resource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public long getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(long goodsCount) {
        this.goodsCount = goodsCount;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsDec() {
        return goodsDec;
    }

    public void setGoodsDec(String goodsDec) {
        this.goodsDec = goodsDec;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "GoodsListModel{" +
                "id='" + id + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTime='" + createTime + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsCount=" + goodsCount +
                ", goodsPrice=" + goodsPrice +
                ", goodsType='" + goodsType + '\'' +
                ", goodsDec='" + goodsDec + '\'' +
                ", resource='" + resource + '\'' +
                '}';
    }
}
