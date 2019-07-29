package com.example.demo.entity.vo;

import lombok.Data;

/**
 * @Author dongm
 * @Description: 分页pageVo
 * @Date 2019/7/29 15:04
 */
@Data
public class PageVo {
    /**
     * 当前页
     */
    private Integer current = 1;
 
    /**
     * 每页显示数量
     */
    private Integer size = 5;
    /**
     * 查询
     */
    private String search;

    /**
     * 排序
     */
    private String sort;
    /**
     * 是否正序
     */
    private boolean isAsc;

    /**
     * 查询开始时间
     */
    private String searchBeginTime;

    /**
     * 查询结束时间
     */
    private String searchEndTime;

}
