package com.latinos.chapter1.repository;

import com.latinos.chapter1.entity.User;

import java.util.List;

/**
 * @author: latinos-bub
 * @date: 2020/3/5 20:22
 * @description: 使用mybatis
 * @className: UserMapper
 */
public interface UserMapper {

    /**
     * 新增用户
     */
    int save(User user);

    /**
     * 更新用户信息
     */
    int update(User user);

    /**
     * 根据id删除
     */
    int deleteById(Long id);

    /**
     * 根据id删除
     */
    User selectById(int id);

    /**
     * 查询所有用户信息
     */
    List<User> selectAll();
}
