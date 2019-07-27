package com.example.demo.entity.po;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author dongm
 * @since 2019-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("JFTest")
public class JFTest extends Model<JFTest> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 性别 0:女,1:男
     */
    private String sex;
    /**
     * 状态 0:离职，1:在职
     */
    private String status;
    /**
     * 内容
     */
    private String count;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 1：删除 0：未删除
     */
    @TableField("del_flag")
    private Long delFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
