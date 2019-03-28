package com.lss.test;

import com.lss.doman.User;
import com.lss.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther: lss
 * @Date: 2019/3/29 00:33
 * @Description: 用户的业务层测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testFindAll(){
        List<User> all = userService.findAll();
        System.out.println(all);
    }

    @Test
    public void testFindById(){
        User user = userService.findById(1);
        System.out.println(user);
    }

    @Test
    public void testUpdate(){
        User user = userService.findById(1);
        System.out.println("修改前的用户"+user);

        user.setAge(55);
        userService.updateUser(user);

        User user1 = userService.findById(1);
        System.out.println("修改后的用户"+user1);
    }
}
