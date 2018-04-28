package com.yangtao.springDemo.service;

import com.yangtao.springDemo.domain.User;

/**
 * 用户接口
 * @author Gao
 * @date 2018/4/26 16:44
 */
public interface UserService extends BaseService<User>{
    Integer countAllNumber();
}
