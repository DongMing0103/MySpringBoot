package com.example.demo.entity.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;

import java.util.Date;

/**
 * @author dongm
 * @Description:
 * @Date 2019/7/26 17:39
 */
@Data
public class JFTestVo {

    public Integer id;
    /**
     * 姓名
     */
    public String name;
    /**
     * 密码
     */
    public String password;
    /**
     * 性别 0:女,1:男
     */
    public String sex;
    /**
     * 状态 0:离职，1:在职
     */
    public String status;
    /**
     * 内容
     */
    public String count;
    /**
     * 创建时间
     */
    @TableField("create_time")
    public Date createTime;
    /**
     * 1：删除 0：未删除
     */
    @TableField("del_flag")
    public Long delFlag;
}
