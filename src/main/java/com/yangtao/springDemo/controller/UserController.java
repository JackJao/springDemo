package com.yangtao.springDemo.controller;

import com.yangtao.springDemo.domain.User;
import com.yangtao.springDemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: TODO
 * @Author Gao
 * @Date 2018/4/26 16:48
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    @GetMapping("getAll")
    public List<User> getAll(){
        return userService.selectListAll();
    }
}
