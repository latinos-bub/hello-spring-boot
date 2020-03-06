package com.latinos.chapter1.service.impl;


// 使用jpa时
//import com.latinos.chapter1.entity.User;
//import com.latinos.chapter1.repository.UserRepository;
//import com.latinos.chapter1.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * @author: latinos-bub
// * @date: 2020/3/5 16:16
// * @description:
// * @className: UserServiceImpl
// */
//@Service
//public class UserServiceImpl implements UserService{
//
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public User saveUser(User user) {
//        return userRepository.save(user);
//    }
//
//    @Override
//    public User updateUser(User user) {
//        return userRepository.save(user);
//    }
//
//    @Override
//    public User getById(Long id) {
//        return userRepository.getOne(id);
//    }
//
//    @Override
//    public User getByUserName(String username) {
//        return userRepository.findUserByUsername(username);
//    }
//
//    @Override
//    public List<User> queryAll() {
//        return userRepository.findAll();
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        userRepository.deleteById(id);
//    }
//}


import com.latinos.chapter1.entity.User;
import com.latinos.chapter1.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 使用mybatis时
@Service
public class UserServiceImpl implements UserMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        return userMapper.save(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int deleteById(Long id) {
        return userMapper.deleteById(id);
    }

    @Override
    public User selectById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}

