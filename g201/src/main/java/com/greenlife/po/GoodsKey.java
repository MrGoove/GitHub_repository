package com.greenlife.po;

/**
 * @Author: 曾远飞
 * @Description:
 * @Date: Created in 5:03 2017/11/3
 * @Modified By:
 */
public class GoodsKey {
    private Integer goodsid;

    private String goodsplace;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsplace() {
        return goodsplace;
    }

    public void setGoodsplace(String goodsplace) {
        this.goodsplace = goodsplace == null ? null : goodsplace.trim();
    }
}
