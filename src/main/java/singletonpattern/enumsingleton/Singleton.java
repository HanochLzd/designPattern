package singletonpattern.enumsingleton;

/**
 * @author Hanoch
 */

public enum Singleton {
    /**
     * 单例
     */
    INSTANCE;

    private Singleton() {
        System.out.println("初始化 ！");
    }

}
