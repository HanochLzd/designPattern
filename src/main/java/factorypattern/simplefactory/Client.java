package factorypattern.simplefactory;

import factorypattern.simplefactory.a.AbstractProduct;
import factorypattern.simplefactory.b.Chart;
import factorypattern.simplefactory.b.ChartFactory;
import factorypattern.simplefactory.b.Factory;
import org.junit.Test;

public class Client {

    @Test
    public void test1() {
        AbstractProduct product;
        //通过工厂类获取产品实例（不需要知道具体如何获取，拿过来使用即可）
        product = Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();
    }

    @Test
    public void test2() {
        AbstractProduct product;
        product = Factory.getProduct("B");
        product.methodSame();
        product.methodDiff();
    }

    @Test
    public void test3() {
        Chart chart;
        chart = ChartFactory.getChart("pie");
        chart.display();
    }

    @Test
    public void test4() {
        Chart chart;
        chart = ChartFactory.getChart("histogram");
        chart.display();
    }

    @Test
    public void test5() {
        Chart chart;
        chart = ChartFactory.getChart("line");
        chart.display();
    }
}
