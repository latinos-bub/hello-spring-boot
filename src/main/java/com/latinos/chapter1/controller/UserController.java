package com.latinos.chapter1.controller;

import com.latinos.chapter1.entity.User;
import com.latinos.chapter1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: latinos-bub
 * @date: 2020/3/5 16:21
 * @description:
 * @className: UserController
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    private UserService userService;


    /**
     * 构建rest api
     * url	                        method	        介绍
     * /user/	                    get	            获取所有的用户信息
     * /user/id/{id}	            get	            根据id获取用户信息
     * /user/username/{username}	get	            根据username获取用户信息
     * /user	                    post	        新增用户信息
     * /user	                    put	            更新用户信息
     * /user/id/{id}	            delete	        根据id删除用户信息
     *
     */

    @PostMapping // 此处是新增，按照rest api规范应该使用 post方法
    public User save(@RequestBody User user){

        return userService.saveUser(user);
    }


    @PutMapping // 此处是更新，按照上述规范，应该为 put 方法
    public User update(@RequestBody User user){

        return userService.updateUser(user);
    }


    @DeleteMapping(value = "/id/{id}") // 此处是删除，按照上述规范，应该为 delete 方法, url应为 /user/id/{id}
    public String delete(@PathVariable Long id){

        userService.deleteById(id);
        return "删除成功";
    }


    @GetMapping(value = "/id/{id}")
    public User findById(@PathVariable Long id){

        return userService.getById(id);
    }


    @GetMapping(value = "/username/{username}")
    public User findByUsername(@PathVariable String username){

        return userService.getByUserName(username);
    }



    @GetMapping(value = "/")
    public List<User> findAll(){

        return userService.queryAll();
    }
}
