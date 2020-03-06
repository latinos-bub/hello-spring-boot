package com.latinos.chapter1.entity;

// 使用 JPA 的方式创建 entity
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//
//
//
///**
// * @author: latinos-bub
// * @date: 2020/3/5 15:59
// * @description:
// * @className: User
// */
//@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"})
//@Entity
//public class User {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    /**
//     * 用户名
//     */
//    @Column(name = "username", nullable = true, length = 32)
//    private String username;
//
//    /**
//     * 密码
//     */
//    @Column(name = "password", nullable = true, length = 32)
//    private String password;
//
//    /**
//     * 年龄
//     */
//    @Column(name = "age", nullable = true, length = 11)
//    private Integer age;
//
//    /**
//     * 性别 1=男 2=女 其他=保密
//     */
//    @Column(name = "sex", nullable = true, length = 11)
//    private Integer sex;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public Integer getSex() {
//        return sex;
//    }
//
//    public void setSex(Integer sex) {
//        this.sex = sex;
//    }
//}















// 使用普通的 mybatis 方式创建entity
public class User {


    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别 1-男 2-女 其它-保密
     */
    private Integer sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}

