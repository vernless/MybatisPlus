package com.vern.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vern.mapper.UserMapper;
import com.vern.service.UserService;
import com.vern.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @Author 滨
 * @Date 2022/10/8 11:45
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}
