package com.vern.mybatisplus;

import com.vern.mapper.UserMapper;
import com.vern.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author 滨
 * @Date 2022/10/7 17:56
 * @Description: 测试crud
 * @Version 1.0
 */
@SpringBootTest
public class MyBatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void teSelectList(){
        //通过条件构造器查询一个List集合，若无条件则设置为null
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        User u = new User();
        u.setAge(10);
        u.setEmail("222@qq.com");
        u.setName("wuwu");
        int result = userMapper.insert(u);
        System.out.println("result: "+result);
        System.out.println("Id: "+u.getId());
    }

    @Test
    public void testDeleteById(){
        int i = userMapper.deleteById(1578354041859194881L);
        System.out.println("result: " + i);
    }
}
