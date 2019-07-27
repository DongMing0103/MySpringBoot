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

/**
 * <p>
 * 船只最新位置信息表
 * </p>
 *
 * @author dongm
 * @since 2019-07-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("xcb_ship_ll_newest")
public class XcbShipLlNewest extends Model<XcbShipLlNewest> {

    private static final long serialVersionUID = 1L;

    /**
     * id,主键，自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 船号
     */
    @TableField("ship_num")
    private String shipNum;
    /**
     * AIS
     */
    @TableField("ais_number")
    private String aisNumber;
    /**
     * mmsi号
     */
    @TableField("mmsi_number")
    private String mmsiNumber;
    /**
     * 经度
     */
    private String longitude;
    /**
     * 纬度
     */
    private String latitude;
    /**
     * 省name
     */
    @TableField("pro_name")
    private String proName;
    /**
     * 省code
     */
    @TableField("pro_code")
    private String proCode;
    /**
     * 市name
     */
    @TableField("city_name")
    private String cityName;
    /**
     * 市code
     */
    @TableField("city_code")
    private String cityCode;
    /**
     * 区name
     */
    @TableField("area_name")
    private String areaName;
    /**
     * 区code
     */
    @TableField("area_code")
    private String areaCode;
    /**
     * 坐标更新时间
     */
    @TableField("newest_time")
    private String newestTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
