package systemTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddNewPetElements {
    @FindBy(id = "name")
    protected WebElement petName;

    @FindBy(id = "type")
    protected  WebElement petType;

    @FindBy(id = "age")
    protected  WebElement petAge;

    @FindBy(className = "save-button")
    protected WebElement saveButton;
}
