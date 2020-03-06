package com.latinos.chapter1.service;

import com.latinos.chapter1.entity.User;

import java.util.List;

/**
 * @author: latinos-bub
 * @date: 2020/3/5 16:11
 * @description:
 * @className: UserService
 */
public interface UserService {


    /**
     * 添加用户信息
     * @param user
     * @return
     */
    User saveUser(User user);


    /**
     * 更新用户信息
     * @param user
     * @return
     */
    User updateUser(User user);


    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    User getById(Long id);


    /**
     * 根据名称获取用户
     * @param username
     * @return
     */
    User getByUserName(String username);


    /**
     * 查询所有用户
     * @return
     */
    List<User> queryAll();


    /**
     * 根据id删除用户信息
     * @param id
     */
    void deleteById(Long id);
}
