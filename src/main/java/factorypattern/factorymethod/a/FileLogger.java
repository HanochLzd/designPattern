package factorypattern.factorymethod.a;

/**
 * 文件日志记录器：具体产品
 *
 * @author Hanoch
 */
public class FileLogger implements Logger {

    private String args;

    private Object object;

    public FileLogger() {
    }

    public FileLogger(String args) {
        this.args = args;
    }

    public FileLogger(Object object) {
        this.object = object;
    }

    @Override
    public void writeLog() {
        System.out.println("使用参数args：" + args + "创建文件日志记录");
    }
}
