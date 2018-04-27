package com.yangtao.springDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: TODO
 * @Author Gao
 * @Date 2018/4/26 18:49
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/login")
    public String index(){
        return "login";
    }
}
