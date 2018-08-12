package factorypattern.factorymethod.a;

/**
 * 文件日志记录器工厂类：具体工厂
 *
 * @author Hanoch
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //其他操作
        //返回具体产品对象
        return new FileLogger();
    }

    @Override
    public Logger createLogger(String args) {
        //操作1
        return new FileLogger(args);
    }

    @Override
    public Logger createLogger(Object obj) {
        //操作2
        return new FileLogger(obj);
    }
}
