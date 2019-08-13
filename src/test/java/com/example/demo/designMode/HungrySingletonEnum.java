package com.example.demo.designMode;

/**
 * @Author dongm
 * @Description: 单例模式（饿汉模式——枚举方式）
 * @Date 2019/8/13 11:08
 */
public enum HungrySingletonEnum {
    // 定义一个枚举的元素，它就是 Singleton 的一个实例
    INSTANCE;

    public void doSomeThing() {
        System.out.println("简单饿汉模式——枚举方式");
    }
}
