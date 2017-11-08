package com.greenlife.po;

public class Order {
    private Integer orderid;

    private String ordertotal;

    private Integer userid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrdertotal() {
        return ordertotal;
    }

    public void setOrdertotal(String ordertotal) {
        this.ordertotal = ordertotal == null ? null : ordertotal.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}