package com.vern.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * @Author 滨
 * @Date 2022/10/7 17:45
 * @Version 1.0
 */
@Data
/*@TableName("tb_user")*/
public class User {
    //当实体类的字段和主键不相等时，使用value赋值成数据表的主键
    //type 是生成主键的策略，默认是雪花算法（ASSIGN_ID），AUTO是自增算法
    //@TableId(value = "uid", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;

    private String email;

}
