package com.greenlife.po;

import java.util.List;

/**
 * @Author: 曾远飞
 * @Description:
 * @Date: Created in 2:21 2017/11/2
 * @Modified By:
 */
public class GoodsVo {
    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    private GoodsCustom goodsCustom;
    private ManagerCustom managerCustom;
    private OrderCustom orderCustom;
    private UserCustom userCustom;
    private List<GoodsCustom> goodsCustomList;
    private List<ManagerCustom> managerCustomList;
    private List<OrderCustom> orderCustomsList;
    private List<UserCustom> userCustomList;

    public GoodsCustom getGoodsCustom() {
        return goodsCustom;
    }

    public void setGoodsCustom(GoodsCustom goodsCustom) {
        this.goodsCustom = goodsCustom;
    }

    public ManagerCustom getManagerCustom() {
        return managerCustom;
    }

    public void setManagerCustom(ManagerCustom managerCustom) {
        this.managerCustom = managerCustom;
    }

    public OrderCustom getOrderCustom() {
        return orderCustom;
    }

    public void setOrderCustom(OrderCustom orderCustom) {
        this.orderCustom = orderCustom;
    }

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }

    public List<GoodsCustom> getGoodsCustomList() {
        return goodsCustomList;
    }

    public void setGoodsCustomList(List<GoodsCustom> goodsCustomList) {
        this.goodsCustomList = goodsCustomList;
    }

    public List<ManagerCustom> getManagerCustomList() {
        return managerCustomList;
    }

    public void setManagerCustomList(List<ManagerCustom> managerCustomList) {
        this.managerCustomList = managerCustomList;
    }

    public List<OrderCustom> getOrderCustomsList() {
        return orderCustomsList;
    }

    public void setOrderCustomsList(List<OrderCustom> orderCustomsList) {
        this.orderCustomsList = orderCustomsList;
    }

    public List<UserCustom> getUserCustomList() {
        return userCustomList;
    }

    public void setUserCustomList(List<UserCustom> userCustomList) {
        this.userCustomList = userCustomList;
    }
}
