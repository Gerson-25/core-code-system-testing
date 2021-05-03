package integrationTesting;

import org.testng.annotations.Test;

public class PostRequestTest {
    @Test(groups = "post")
    public void addPets(){
        PostRequest postRequest = new PostRequest();
        //postRequest.createNewUser();
    }
}
