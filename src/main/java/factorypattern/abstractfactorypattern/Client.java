package factorypattern.abstractfactorypattern;

import factorypattern.PropertiesUtil;
import org.junit.Test;

/**
 * @author Hanoch
 */
public class Client {

    @Test
    public void test1() throws Exception {

        SkinFactory skinFactory;
        Button button;
        ComboBox comboBox;
        TextField textField;
        skinFactory = (SkinFactory) Class
                .forName(PropertiesUtil.getClazzName("spring", "skin.properties"))
                .getDeclaredConstructor()
                .newInstance();
        button = skinFactory.createButton();
        comboBox = skinFactory.createComBox();
        textField = skinFactory.createTextField();
        button.display();
        comboBox.display();
        textField.display();
    }

    @Test
    public void test2() throws Exception {

        SkinFactory skinFactory;
        Button button;
        ComboBox comboBox;
        TextField textField;
        skinFactory = (SkinFactory) Class
                .forName(PropertiesUtil.getClazzName("summer", "skin.properties"))
                .getDeclaredConstructor()
                .newInstance();
        button = skinFactory.createButton();
        comboBox = skinFactory.createComBox();
        textField = skinFactory.createTextField();
        button.display();
        comboBox.display();
        textField.display();
    }
}
