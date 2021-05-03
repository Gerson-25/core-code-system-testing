package systemTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewPetActions extends AddNewPetElements {

private WebDriver webDriver;
private WebDriverWait webDriverWait;

    private WebDriver driver;
    private WebDriverWait wait;

    public AddNewPetActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }

    public void fillImputs(String name, String type, String age) throws InterruptedException {
        fillName(name);
        fillType(type);
        fillAge(age);
        Thread.sleep(10000);
        clickSaveButton();
        Thread.sleep(10000);
    }

    private void fillName(String name){
        petName.sendKeys(name);
    }

    private void fillType(String type){
        WebElement petTypeElement = wait.until(ExpectedConditions.visibilityOf(petType));
        Select petTypeSelect = new Select(petTypeElement);
        petTypeSelect.selectByValue(type);
    }

    private void fillAge(String age){
        petAge.sendKeys(age);
    }

    private void clickSaveButton(){
        saveButton.click();
    }

}
