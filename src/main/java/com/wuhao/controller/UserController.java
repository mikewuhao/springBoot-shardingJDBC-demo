package com.wuhao.controller;

import com.wuhao.configuration.IDUtil;
import com.wuhao.dao.UserMapper;
import com.wuhao.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: userController
 * @author: wuhao
 * @create: 2020-06-17 22:21
 **/
@RestController
@Slf4j
public class UserController {

    @Autowired
    UserMapper userDao;
    
    /***
    * @Description: 添加用戶数据
    * @Author: wuhao
    * @Date: 2020/6/17 22:31
    */
    @RequestMapping("/testInsertUser")
    public void testInsertUser(){
        for(int i=0; i<20 ;i++){
            User user = new User();
            user.setUserId(IDUtil.getRandomId());
            user.setAddress("北京市通州区");
            user.setAge(10+i);
            user.setBirthday("1992-01-01");
            user.setUserName("小吴"+i);
            user.setSex(i%2+1);
            userDao.addUser(user);
        }
    }


    /***
    * @Description: 查询所有数据
    * @return: java.lang.String
    * @Author: wuhao
    * @Date: 2020/6/17 22:30
    */
    @RequestMapping("/testQueryUser")
    public String testQueryUser(){
        List<User> userList = userDao.queryAllUser();
        return userList.toString();
    }


}
