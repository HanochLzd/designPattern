package singletonpattern;

/**
 * @author Hanoch
 */
public class Singleton {

    private Singleton(){
    }

    private static class HolderClass{
        private final static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return HolderClass.INSTANCE;
    }
}


