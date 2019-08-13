package com.example.demo.designMode;

/**
 * @Author dongm
 * @Description: 单例模式（懒汉模式——登记式/静态内部类方式）
 *                  只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，
 *                  从而实例化 instance（只有第一次使用这个单例的实例的时候才加载，同时不会有线程安全问题）
 * @Date 2019/8/13 11:27
 */
public class LazySingletonForStatic {

    private static class LazySingletonHolder {
        private static final LazySingletonForStatic INSTANCE = new LazySingletonForStatic();
    }

    private LazySingletonForStatic(){}

    public static final LazySingletonForStatic getInstance() {
        return LazySingletonHolder.INSTANCE;
    }
}
