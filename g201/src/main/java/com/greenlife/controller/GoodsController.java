package com.greenlife.controller;

import com.greenlife.po.Goods;
import com.greenlife.po.GoodsVo;
import com.greenlife.service.Impl.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: 曾远飞
 * @Description:
 * @Date: Created in 4:35 2017/11/3
 * @Modified By:
 */
@Controller
public class GoodsController {
    @Autowired
    private GoodsServiceImpl goodsService;

    /*添加商品*/
    @RequestMapping("/addGoods.action")
    public String addGoods(GoodsVo goodsVo){
        goodsService.addGoods(goodsVo);
        return "success.jsp";
    }

    /*查询商品*/
    @RequestMapping("/findGoodsByName.action")
    public String findGoodsByName(GoodsVo goodsVo,HttpServletRequest request){
        Goods goods=goodsService.findGoodsByName(goodsVo);
        request.setAttribute("goods",goods);
        return "forward:/proinfo.jsp";
    }
}
