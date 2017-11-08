package com.greenlife.controller;

import com.greenlife.po.GoodsVo;
import com.greenlife.po.User;
import com.greenlife.service.Impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author: 曾远飞
 * @Description:
 * @Date: Created in 2:47 2017/11/2
 * @Modified By:
 */
@Controller
public class LoginController {
    @Autowired
    private LoginServiceImpl loginService;
    /*用户登陆*/
    @RequestMapping("/userLogin.action")
    public String login(GoodsVo goodsVo, HttpSession session, ModelMap modelMap){
        boolean b=loginService.login(goodsVo);
        if(b==true) {
            User user = loginService.findUserByName(goodsVo);
            session.setAttribute("user", user);
            modelMap.addAttribute("user", user);
            return "forward:/index.jsp";
        }else {
            return "/login";
        }
    }
}
