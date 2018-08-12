package factorypattern;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Hanoch
 */
public class PropertiesUtil {

    /**
     * 该方法用于从配置文件中提取图表类型，并返回类名
     * @param type
     * @param path
     * @return
     */
    public static String getClazzName(String type,String path) {
        Properties properties = new Properties();
        InputStream br = null;
        try {
            br = PropertiesUtil.class.getClassLoader().getResourceAsStream(path);
            properties.load(br);
            return properties.getProperty(type);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
