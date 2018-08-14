package factorypattern.abstractfactorypattern;

/**
 * Summer按钮类：具体产品
 *
 * @author Hanoch
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮");
    }
}
