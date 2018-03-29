package com.test.controller;

import com.test.domain.User;
import com.test.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2018/3/28.
 */
@Controller
@RequestMapping(value="/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "add",produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
         return  userService.addUser(user);
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Object findAllUser(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize){
        
        return userService.findAllUser(pageNum,pageSize);
    }
}
