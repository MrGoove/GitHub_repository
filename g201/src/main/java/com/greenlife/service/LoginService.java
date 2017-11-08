package com.greenlife.service;

/*import com.greenlife.po.GoodsVo;*/

import com.greenlife.po.GoodsVo;
import com.greenlife.po.User;

/**
 * @Author: 曾远飞
 * @Description:
 * @Date: Created in 2:24 2017/11/2
 * @Modified By:
 */
public interface LoginService {
    public boolean login(GoodsVo goodsVo);
    public User findUserByName(GoodsVo goodsVo);
}
