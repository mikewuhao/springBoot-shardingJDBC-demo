package com.wuhao.service.impl;

import com.wuhao.dao.UserMapper;
import com.wuhao.domain.User;
import com.wuhao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @description: 用户接口
 * @author: wuhao
 * @create: 2020-06-17 22:38
 **/
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

}
