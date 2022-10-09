package com.vern.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Data;
import lombok.Getter;

/**
 * @Author 滨
 * @Date 2022/10/9 13:42
 * @Description: TODO
 * @Version 1.0
 */
@Getter
public enum SexEnum {
    MALE(1,"男"),FEMALE(2,"女");

    @EnumValue
    private Integer sex;

    private String sexName;

    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }
}
