package com.xxxx.crm;

import com.xxxx.crm.dao.UserMapper;
import com.xxxx.crm.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ZCP
 * @title: UserTest
 * @projectName crm
 * @description: TODO
 * @date 2022/2/18 13:08
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void pwdTest()
    {
        User admin = userMapper.queryUserByName("admin");

        System.out.println(admin.getUserPwd());

    }
}
