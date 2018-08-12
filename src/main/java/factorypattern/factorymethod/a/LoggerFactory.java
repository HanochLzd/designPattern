package factorypattern.factorymethod.a;

/**
 * 日志记录器工厂接口：抽象工厂
 */
public interface LoggerFactory {
    /**
     * 创建具体日志记录器
     *
     * @return
     */
    Logger createLogger();

    /**
     * 方法重载1
     *
     * @param args
     * @return
     */
    Logger createLogger(String args);

    /**
     * 方法重载2
     *
     * @param obj
     * @return
     */
    Logger createLogger(Object obj);
}
