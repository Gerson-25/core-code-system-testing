package integrationTesting;

import dataProviders.DataProvidersClass;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostRequest {


        @Test(dataProviderClass = DataProvidersClass.class, dataProvider = "getParameters", groups = {"integrationTesting"})
        public void createNewPet(String bodyContent){
            Response response = RequestMaker.makePostRequest("http://localhost:8083/api/pets/addNewPet",bodyContent);
            if(bodyContent.contains("10")){
                // Assert.fail("fails");
            }
            String responseString = response.asString();
            //System.out.println(responseString);
        }

}
