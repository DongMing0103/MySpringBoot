package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.entity.po.JFTest;
import com.example.demo.entity.vo.JFTestVo;
import com.example.demo.service.IJFTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author dongm
 * @since 2019-07-26
 */
//@Controller
@RestController
@RequestMapping("/jftest")
public class JFTestController {

    @Autowired
    private IJFTestService ijfTestService;

    /**
     * @author dongm
     * @Description： 数据查询
     * @date：2019/7/26 17:18
     * @param:
     */
    @RequestMapping("/index")
    public String index() {
        System.out.println("Hello Husike");
        JFTest test = new JFTest();
        JSONObject obj = new JSONObject();
        List<JFTest> list = ijfTestService.selectList(new EntityWrapper<>(test));
        obj.put("list",list);
        System.out.println("jfTest ===== " + obj);
        return "Hello Husike：" + obj;
    }

    /**
     * @author dongm
     * @Description：根据vo查询数据
     * @date：2019/7/29 11:44
     * @param:
     */
    @RequestMapping("/query")
    public String query(JFTestVo vo) {
        System.out.println("query Husike");
        Integer id = vo.getId();
        JFTest jfTest = ijfTestService.selectById(id);
        System.out.println("查询数据为：" + jfTest);
        return "Query Husike: " + jfTest;
    }

    /**
     * @author dongm
     * @Description：分页查询
     * @date：2019/7/29 16:10
     * @param:
     */
    @RequestMapping("/queryPage")
    public Page<JFTest> queryPage(JFTestVo vo) {
        System.out.println("queryPage Husike");
        Page<JFTest> page = ijfTestService.selectPageByVo(vo);
        System.out.println("分页查询数据为：" + page);
        return page;
    }

    /**
     * @author dongm
     * @Description： 增加数据
     * @date：2019/7/26 17:32
     * @param:
     */
    @RequestMapping("/add")
    public void add(JFTestVo jfTestVo) {
        System.out.println("add Husike");
        ijfTestService.save(jfTestVo);
        System.out.println("插入成功了吧~~~~");
    }

    /**
     * @author dongm
     * @Description：修改数据
     * @date：2019/7/29 9:46
     * @param:
     */
    @RequestMapping("/update")
    public void update(JFTestVo vo) {
        System.out.println("update Husike");
        ijfTestService.update(vo);
        System.out.println("修改数据信息~~~~");
    }

    /**
     * @author dongm
     * @Description：删除数据
     * @date：2019/7/29 10:56
     * @param:
     */
    @RequestMapping("delete")
    public void delete(JFTestVo vo) {
        System.out.println("delete Husike");
//        ijfTestService.deleteById(vo.getId());
//        System.out.println("物理删除数据~~~~");
        ijfTestService.delete(vo);
        System.out.println("逻辑删除数据~~~~");
    }
}

