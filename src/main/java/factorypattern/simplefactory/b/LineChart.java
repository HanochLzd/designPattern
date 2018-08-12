package factorypattern.simplefactory.b;

/**
 * 折线图类：具体产品类
 */
public class LineChart implements Chart {

    public LineChart() {
        System.out.println("创建折线图！");
        System.out.println("初始化折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}
