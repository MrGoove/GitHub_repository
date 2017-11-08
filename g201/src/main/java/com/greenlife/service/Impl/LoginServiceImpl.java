package com.greenlife.service.Impl;

import com.greenlife.mapper.UserMapper;
import com.greenlife.po.GoodsVo;
import com.greenlife.po.User;
import com.greenlife.po.UserCustom;
import com.greenlife.po.UserExample;
import com.greenlife.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: 曾远飞
 * @Description:
 * @Date: Created in 2:25 2017/11/2
 * @Modified By:
 */
public class LoginServiceImpl implements LoginService {
    @Override
    public boolean login(GoodsVo goodsVo) {
        UserCustom userCustom=goodsVo.getUserCustom();
        User user=findUserByName(goodsVo);
        if(user!=null&&!user.equals("")) {
            if (userCustom.getUsername().equals(user.getUsername())) {
                if (userCustom.getPassword().equals(user.getPassword())) {
                    return true;
                }
            }
        }
        return false;
    }


    @Autowired
    private UserMapper userMapper;
    /*根据用户名查找用户*/
    @Override
    public User findUserByName(GoodsVo goodsVo) {
        UserCustom userCustom=goodsVo.getUserCustom();
        String username=userCustom.getUsername();
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> userList=userMapper.selectByExample(userExample);
        return userList.get(0);
    }
}
