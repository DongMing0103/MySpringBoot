package com.example.demo.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.example.demo.entity.po.JFTest;
import com.example.demo.entity.vo.JFTestVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dongm
 * @since 2019-07-26
 */
public interface IJFTestService extends IService<JFTest> {
    void save(JFTestVo vo);
    void update (JFTestVo vo);
    void delete (JFTestVo vo);
    Page<JFTest> selectPageByVo(JFTestVo vo);
}
