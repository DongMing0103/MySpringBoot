package com.example.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.entity.po.JFTest;
import com.example.demo.entity.vo.JFTestVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author dongm
 * @since 2019-07-26
 */
@Mapper
@Repository
public interface JFTestMapper extends BaseMapper<JFTest> {
    /**
     * @author dongm
     * @Description：根据vo查询分页数据
     * @date：2019/7/29 15:52
     * @param:
     */
    List<JFTest> selectPageByVo(Page<JFTest> page, JFTestVo vo);
}
