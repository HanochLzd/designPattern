package factorypattern.abstractfactorypattern;

public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComBox() {
        return new SummerComboBox();
    }
}
