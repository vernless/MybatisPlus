package com.vern.mybatisplus;

import com.vern.pojo.User;
import com.vern.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 滨
 * @Date 2022/10/8 11:48
 * @Description: TODO
 * @Version 1.0
 */
@SpringBootTest
public class MyBatisPlusServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetCount(){
        long count = userService.count();
        System.out.println("count:  "+count);
    }

    @Test
    public void testInsertMore(){
        List<User> list = new ArrayList<>();
        for(int i = 0 ; i < 3 ; i++){
            User u = new User();
            u.setEmail(i + "aabbcc@qq.com");
            u.setName(i + "abc");
            u.setAge(i + 20);
            list.add(u);
        }
        boolean b = userService.saveBatch(list);
        System.out.println("result:  " + b);
    }
}
