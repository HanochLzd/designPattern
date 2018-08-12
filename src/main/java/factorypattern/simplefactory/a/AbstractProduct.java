package factorypattern.simplefactory.a;

/**
 * 产品抽象类
 *
 */
public abstract class AbstractProduct {

    /**
     * 所有产品类的功能业务方法
     */
    public void methodSame() {
        //公共方法的实现
        System.out.println("common method!");
    }

    /**
     * 声明抽象业务方法（有具体类实现）
     */
    public abstract void methodDiff();
}
