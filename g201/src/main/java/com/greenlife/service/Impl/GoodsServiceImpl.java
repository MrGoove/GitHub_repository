package com.greenlife.service.Impl;

import com.greenlife.mapper.GoodsMapper;
import com.greenlife.po.Goods;
import com.greenlife.po.GoodsCustom;
import com.greenlife.po.GoodsExample;
import com.greenlife.po.GoodsVo;
import com.greenlife.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: 曾远飞
 * @Description:
 * @Date: Created in 1:57 2017/11/2
 * @Modified By:
 */
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public Goods findGoodsByID(GoodsVo goodsVo) {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria=goodsExample.createCriteria();
        criteria.andGoodsidEqualTo(goodsVo.getGoodsCustom().getGoodsid());
        List<Goods> goodsList=goodsMapper.selectByExample(goodsExample);
        return goodsList.get(0);
    }

    @Override
    public Goods findGoodsByName(GoodsVo goodsVo) {
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria=goodsExample.createCriteria();
        criteria.andGoodsnameLike("%"+goodsVo.getGoods().getGoodsname()+"%");

        List<Goods> goodsList=goodsMapper.selectByExample(goodsExample);
        if(goodsList.size()>0){
            return goodsList.get(0);
        }else{
            return null;
        }

    }

    @Override
    public void addGoods(GoodsVo goodsVo) {
        goodsMapper.insert(goodsVo.getGoodsCustom());
    }

    @Override
    public void deleteGoods(GoodsVo goodsVo) {
        Goods goods=findGoodsByID(goodsVo);
        goodsMapper.deleteByPrimaryKey(goods.getGoodsid());
    }


}
