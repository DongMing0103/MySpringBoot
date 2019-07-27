package com.example.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.entity.po.JFTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dongm
 * @since 2019-07-26
 */
@Mapper
@Repository
public interface JFTestMapper extends BaseMapper<JFTest> {

}
