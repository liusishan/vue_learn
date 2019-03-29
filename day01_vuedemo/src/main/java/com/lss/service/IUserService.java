package com.lss.service;

import com.lss.domain.User;

import java.util.List;

/**
 * @Auther: lss
 * @Date: 2019/3/29 00:13
 * @Description:用户的业务层方法
 */
public interface IUserService {

    /**
     * 查询用户列表
     */
    List<User> findAll();

    /**
     * 根据id查询
     *
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 更新用户
     *
     * @param user
     */
    void updateUser(User user);
}
