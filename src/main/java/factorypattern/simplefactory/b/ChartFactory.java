package factorypattern.simplefactory.b;

import factorypattern.PropertiesUtil;

/**
 * 图表工厂类
 */
public class ChartFactory {

    /**
     * 静态工厂方法
     *
     * @param type
     * @return
     */
    public static Chart getChart(String type) {
        Chart chart = null;
        try {
            chart = (Chart) Class.forName(PropertiesUtil
                    .getClazzName(type,"chart.properties"))
                    .getDeclaredConstructor()
                    .newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chart;
    }
}
