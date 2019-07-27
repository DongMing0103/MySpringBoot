package com.example.demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.entity.po.JFTest;
import com.example.demo.mapper.JFTestMapper;
import com.example.demo.service.IJFTestService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dongm
 * @since 2019-07-26
 */
@Service
public class JFTestServiceImpl extends ServiceImpl<JFTestMapper, JFTest> implements IJFTestService {

}
