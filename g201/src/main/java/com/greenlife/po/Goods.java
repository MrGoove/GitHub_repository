package com.greenlife.po;

public class Goods extends GoodsKey{

    private String goodsname;

    private String goodsnumber;

    private Double goodsprice;

    private String goodsunit;

    private String goodspic;



    private Integer oid;

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsnumber() {
        return goodsnumber;
    }

    public void setGoodsnumber(String goodsnumber) {
        this.goodsnumber = goodsnumber == null ? null : goodsnumber.trim();
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodsunit() {
        return goodsunit;
    }

    public void setGoodsunit(String goodsunit) {
        this.goodsunit = goodsunit == null ? null : goodsunit.trim();
    }

    public String getGoodspic() {
        return goodspic;
    }

    public void setGoodspic(String goodspic) {
        this.goodspic = goodspic == null ? null : goodspic.trim();
    }





    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}