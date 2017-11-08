package com.greenlife.service;

import com.greenlife.po.Goods;
import com.greenlife.po.GoodsCustom;
import com.greenlife.po.GoodsVo;

/**
 * @Author: 曾远飞
 * @Description:
 * @Date: Created in 1:57 2017/11/2
 * @Modified By:
 */
public interface GoodsService {
    public Goods findGoodsByID(GoodsVo goodsVo);
    public Goods findGoodsByName(GoodsVo goodsVo);
    public void addGoods(GoodsVo goodsVo);
    public void deleteGoods(GoodsVo goodsVo);
}
