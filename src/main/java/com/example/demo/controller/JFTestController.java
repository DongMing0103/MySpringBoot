package com.example.demo.controller;


import com.example.demo.entity.po.JFTest;
import com.example.demo.service.IJFTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
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

    /*
     * @author dongm
     * @Description： 数据查询
     * @date：2019/7/26 17:18
     * @param:
     */
    @RequestMapping("/index")
    public String index() {
        System.out.println("Hello Husike");
        JFTest jfTest = ijfTestService.selectById(1);
        System.out.println("jfTest ===== " + jfTest);
        return "Hello Husike：" + jfTest;
    }

    /*
     * @author dongm
     * @Description： 增加数据
     * @date：2019/7/26 17:32
     * @param:
     */
    @RequestMapping("/add")
    public String add(HttpRequest request) {
        String value = request.getMethodValue();
        System.out.println("value ====== " + value);
        System.out.println("add Husike");
//        ijfTestService.sa(jfTestVo);
        return null;
    }
}

