package com.latinos.chapter1.repository;

import com.latinos.chapter1.entity.User;
import com.latinos.chapter1.repository.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: latinos-bub
 * @date: 2020/3/5 22:34
 * @description:
 * @className: UserMapperTest
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void save() {
        User user = new User();
        user.setUsername("zzzz");
        user.setPassword("bbbb");
        user.setSex(1);
        user.setAge(18);
        // 返回插入的记录数 ，期望是1条 如果实际不是一条则抛出异常
        Assert.assertEquals(1,userMapper.save(user));
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(1L);
        user.setPassword("newpassword");
        // 返回插入的记录数 ，期望是1条 如果实际不是一条则抛出异常
        Assert.assertEquals(1,userMapper.update(user));
    }

    @Test
    public void selectById() {
        Assert.assertNotNull(userMapper.selectById(1));
    }

    @Test
    public void deleteById() {
        Assert.assertEquals(1,userMapper.deleteById(1L));
    }


}
