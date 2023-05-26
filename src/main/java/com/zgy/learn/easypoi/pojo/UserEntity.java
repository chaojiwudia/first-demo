package com.zgy.learn.easypoi.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "user")
public class UserEntity {
    //指定主键自增策略:value与数据库主键列名一致，若实体类属性名与表主键列名一致可省略value
    @TableId(type = IdType.AUTO)
    private Integer user_id;
    private String account;
    private String nickname;
    private String password;
    private String headimage_url;
    private String introduce;

}
