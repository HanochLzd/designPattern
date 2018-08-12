package factorypattern.factorymethod.a;

import factorypattern.PropertiesUtil;


public class Client {
    public static void main(String[] args) throws Exception {
        LoggerFactory loggerFactory;
        Logger logger;
        //通过配置文件获取需要的日志记录器工厂类
        String clazzName = PropertiesUtil.getClazzName("FileLogger", "logger.properties");
        loggerFactory = (LoggerFactory) Class.forName(clazzName).getDeclaredConstructor().newInstance();
        logger = loggerFactory.createLogger("456");
        logger.writeLog();
    }
}
