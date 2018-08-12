package factorypattern.simplefactory.a;

/**
 * 具体产品类A
 */
public class ConcreteProductA extends AbstractProduct {

    @Override
    public void methodDiff() {
        //业务实现方法
        System.out.println("ConreteProductA method!");
    }
}
