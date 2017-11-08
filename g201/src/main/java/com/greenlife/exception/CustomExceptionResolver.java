package com.greenlife.exception;

import org.jetbrains.annotations.Nullable;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 曾远飞
 * @Description:
 * @Date: Created in 1:53 2017/11/2
 * @Modified By:
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {
    @Nullable

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @Nullable Object o, Exception e) {
        return null;
    }
}
