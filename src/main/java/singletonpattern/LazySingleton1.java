package singletonpattern;

public class LazySingleton1 {
    private volatile static LazySingleton1 instance = null;

    private LazySingleton1() {
    }

    public static LazySingleton1 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton1.class) {
                if (instance == null) {
                    instance = new LazySingleton1();
                }
            }
        }
        return instance;
    }
}
