package prototypepattern;

import java.io.IOException;

/**
 * @author Hanoch
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建原型对象
        WeeklyLog log_previous = new WeeklyLog();
        log_previous.setA(new A());
        log_previous.setName("小张");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");

        print(log_previous);
        WeeklyLog log_new;

        log_new = log_previous.clone();

        System.out.println(log_previous);
        System.out.println(log_new);
        log_new.setDate("第13周");

        print(log_new);

        System.out.println(log_previous.getA());
        System.out.println(log_new.getA());

        System.out.println("previous == new :" + (log_new == log_previous));
        System.out.println("浅拷贝:previous.A == new.A :" + (log_new.getA() == log_previous.getA()));

        WeeklyLog weeklyLog1 = new WeeklyLog();
        weeklyLog1.setA(new A());
        WeeklyLog weeklyLog2 = weeklyLog1.deepClone();

        System.out.println("深拷贝：previous.A == new.A :" + (weeklyLog1.getA() == weeklyLog2.getA()));

    }

    public static void print(WeeklyLog weeklyLog) {
        System.out.println("*****周报*****");
        System.out.println("周次：" + weeklyLog.getDate());
        System.out.println("姓名：" + weeklyLog.getName());
        System.out.println("内容：" + weeklyLog.getContent());

        System.out.println("----------------------------------");
    }

}
