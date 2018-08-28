package prototypepattern;

import java.io.*;

/**
 * @author Hanoch
 */
public class WeeklyLog implements Cloneable, Serializable {

    private String name;

    private String date;

    private String content;

    private A a;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    /**
     * 克隆方法clone（），使用java提供的克隆机制
     *
     * @return WeeklyLog
     */
    @Override
    public WeeklyLog clone() {
        Object object = null;

        try {
            object = super.clone();
            return (WeeklyLog) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不支持复制！");
            return null;
        }
    }

    /**
     * 深拷贝
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLog) ois.readObject();
    }

}
