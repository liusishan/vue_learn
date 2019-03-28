package com.lss.dao;

import com.lss.doman.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: lss
 * @Date: 2019/3/29 00:06
 * @Description: 用户是的持久层接口
 */
public interface IUserDao {
    /**
     * 查询用户列表
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 根据id查询
     *
     * @param userId
     * @return
     */
    @Select("select * from user where id = #{userId}")
    User findById(Integer userId);

    /**
     * 更新用户
     *
     * @param user
     */
    @Select("update user set username=#{username}," +
            "password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updateUser(User user);
}
