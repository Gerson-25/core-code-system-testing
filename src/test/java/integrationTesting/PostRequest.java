package integrationTesting;

import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostRequest {
    public void createNewUser(String bodyContent){
        Response response = RequestMaker.makePostRequest("http://localhost:8083/api/pets/addNewPet",bodyContent);
        if(bodyContent.contains("499")){
            // Assert.fail("fails");
        }
        String responseString = response.asString();
        System.out.println(responseString);
    }
}
