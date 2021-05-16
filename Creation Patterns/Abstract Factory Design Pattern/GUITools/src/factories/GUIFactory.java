package factories;

import buttons.Buttons;
import checkboxes.Checkbox;

public interface GUIFactory {
    Buttons createButton();
    Checkbox createCheckbox();
}