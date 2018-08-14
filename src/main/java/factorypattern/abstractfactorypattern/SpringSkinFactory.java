package factorypattern.abstractfactorypattern;

/**
 * Spring风格皮肤：具体工厂类
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComBox() {
        return new SpringComboBox();
    }
}
