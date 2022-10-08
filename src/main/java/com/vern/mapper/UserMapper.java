package com.vern.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vern.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author 滨
 * @Date 2022/10/7 17:53
 * @Version 1.0
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
