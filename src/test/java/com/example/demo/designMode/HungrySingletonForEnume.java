package com.example.demo.designMode;

/**
 * @Author dongm
 * @Description: 通过枚举方式创建饿汉单例模式
 * @Date 2019/8/13 11:11
 */
public class HungrySingletonForEnume {
    public static void main(String[] args) {
        HungrySingletonEnum instance = HungrySingletonEnum.INSTANCE;
        instance.doSomeThing();
    }
}
