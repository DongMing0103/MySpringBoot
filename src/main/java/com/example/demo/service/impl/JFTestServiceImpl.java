package com.example.demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.entity.po.JFTest;
import com.example.demo.entity.vo.JFTestVo;
import com.example.demo.mapper.JFTestMapper;
import com.example.demo.service.IJFTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dongm
 * @since 2019-07-26
 */
@Service
public class JFTestServiceImpl extends ServiceImpl<JFTestMapper, JFTest> implements IJFTestService {

    @Autowired
    private JFTestMapper jfTestMapper;

    /**
     * @author dongm
     * @Description：根据vo保存信息
     * @date：2019/7/29 9:11
     * @param:
     */
    @Override
    public void save(JFTestVo vo) {
        JFTest jfTest = new JFTest();
        jfTest.setName(vo.getName());
        jfTest.setCount(vo.getCount());
        jfTest.setPassword(vo.getPassword());
        jfTest.setSex(vo.getSex());
        jfTest.setStatus(vo.getStatus());
        jfTest.setCreateTime(new Date());
        jfTest.setDelFlag(Long.valueOf("0"));
        Integer in = jfTestMapper.insert(jfTest);
        System.out.println("插入个数：" + in);
    }

    /**
     * @author dongm
     * @Description：根据vo修改数据
     * @date：2019/7/29 10:11
     * @param:
     */
    @Override
    public void update(JFTestVo vo) {
        JFTest test = jfTestMapper.selectById(vo.getId());
        test.setName(vo.getName());
        test.setSex(vo.getSex());
        test.setPassword(vo.getPassword());
        test.setCreateTime(new Date());
        test.setStatus(vo.getStatus());
        test.setCount(vo.getCount());
        test.setDelFlag(Long.valueOf("1"));
        Integer in = jfTestMapper.updateById(test);
        System.out.println("修改成功个数：" + in);
    }

    /**
     * @author dongm
     * @Description：逻辑删除信息
     * @date：2019/7/29 10:53
     * @param:
     */
    @Override
    public void delete(JFTestVo vo) {
        JFTest jfTest = jfTestMapper.selectById(vo.getId());
        jfTest.setDelFlag(Long.valueOf("1"));
        Integer in = jfTestMapper.updateById(jfTest);
        System.out.println("逻辑删除个数：" + in);
    }
}
