package app;

import buttons.Buttons;
import checkboxes.Checkbox;
import factories.GUIFactory;

public class Application {
    private Buttons button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
