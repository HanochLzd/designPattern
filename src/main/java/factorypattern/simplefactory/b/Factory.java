package factorypattern.simplefactory.b;

import factorypattern.simplefactory.a.AbstractProduct;
import factorypattern.simplefactory.a.ConcreteProductA;
import factorypattern.simplefactory.a.ConcreteProductB;

public class Factory {

    /**
     * 通过静态工厂方法获取产品实例
     *
     * @param productName
     * @return
     */
    public static AbstractProduct getProduct(String productName) {
        AbstractProduct product = null;
        if ("A".equalsIgnoreCase(productName)) {
            product = new ConcreteProductA();
        } else if ("B".equalsIgnoreCase(productName)) {
            product = new ConcreteProductB();
        }
        //更多产品...
        return product;
    }
}
