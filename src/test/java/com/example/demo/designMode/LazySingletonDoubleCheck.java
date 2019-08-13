package com.example.demo.designMode;

/**
 * @Author dongm
 * @Description: 单例模式（懒汉模式——双重检查加锁版本，指全局的单例实例在第一次被使用时构建。）
 *                  利用双重检查加锁（double-checked locking），首先检查是否实例已经创建，
 *                  如果尚未创建，“才”进行同步。这样以来，只有一次同步，这正是我们想要的效果。
 * @Date 2019/8/13 11:17
 */
public class LazySingletonDoubleCheck {

    // volatile保证，当uniqueInstance变量被初始化成Singleton实例时，多个线程可以正确处理uniqueInstance变量
    private volatile static LazySingletonDoubleCheck uniqueInstance;

    private LazySingletonDoubleCheck(){}

    public static LazySingletonDoubleCheck getInstance() {
        // 检查实例，如果不存在，就进入同步代码块
        if (uniqueInstance == null) {
            // 只有第一次才彻底执行这里的代码
            synchronized (LazySingletonDoubleCheck.class) {
                // 进入同步代码块后，再检查一次，如果仍是null，才创建实例
                if (uniqueInstance == null) {
                    uniqueInstance = new LazySingletonDoubleCheck();
                }
            }
        }
        return uniqueInstance;
    }
}
