package com.yangtao.springDemo.service.impl;

import com.yangtao.springDemo.domain.User;
import com.yangtao.springDemo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description: 这位谢会在service层出现sqlId不美观
 * @Author Gao
 * @Date 2018/4/26 16:45
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Override
    public Integer countAllNumber() {
        return mybatisDao.custerQuery(super.getStatement("countAll"));
    }


}
