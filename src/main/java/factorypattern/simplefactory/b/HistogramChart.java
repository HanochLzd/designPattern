package factorypattern.simplefactory.b;

/**
 * 柱状图类：具体产品类
 */
public class HistogramChart implements Chart {


    public HistogramChart() {
        System.out.println("创建柱状图！");
        System.out.println("初始化柱状图！");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }
}
