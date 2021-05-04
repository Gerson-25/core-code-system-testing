package systemTesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AddPetTest extends InitDriver{

    private AddNewPetActions addNewPetActions;
    @BeforeClass
    private void goToPage(){
        addNewPetActions = new AddNewPetActions(driver, wait);
        driver.get("http://127.0.0.1:5500/QA-project/public/create_appointment.html");
    }

    @Test(groups = "systemTesting")
    public void addNewPetTest() throws InterruptedException {
        String url = driver.getCurrentUrl();
        System.out.println(url);
        addNewPetActions.fillImputs("loki", "Perro", "10");
        String urlNew = driver.getCurrentUrl();
        System.out.println(urlNew);
    }

}
