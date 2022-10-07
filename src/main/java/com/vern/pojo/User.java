package com.vern.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * @Author 滨
 * @Date 2022/10/7 17:45
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@TableName("tb_user")
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String email;

}
