package factorypattern.simplefactory.a;


/**
 * 具体产品类B
 */
public class ConcreteProductB extends AbstractProduct {
    @Override
    public void methodDiff() {
        System.out.println("ConcreteProductB method!");
    }
}
