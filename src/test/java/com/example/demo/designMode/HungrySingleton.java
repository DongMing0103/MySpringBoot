package com.example.demo.designMode;

/**
 * @Author dongm
 * @Description: 单例模式（饿汉模式，线程安全,指全局的单例实例在类装载时构建）
 * @Date 2019/8/13 10:57
 */
public class HungrySingleton {

    // 在静态初始化器中创建单例实例，这段代码保证了线程安全
    private static HungrySingleton uniqueInstance = new HungrySingleton();

    // Singleton类只有一个构造方法并且是被private修饰的，所以用户无法通过new方法创建该对象实例
    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return uniqueInstance;
    }
}
