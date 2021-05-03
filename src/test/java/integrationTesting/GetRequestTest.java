package integrationTesting;

import PetModel.Pet;
import com.google.gson.Gson;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetRequestTest {

    @Test(groups = {"integrationTesting"})
    public void getAllUsers(){
        Response response = RequestMaker.makeGetRequest("http://localhost:8083/api/pets/getAll");
        String responseString = response.asString();
        Gson gson = new Gson();
        Pet[] users = gson.fromJson(responseString,Pet[].class);
        for (int i = 0; i < users.length; i ++){
            Pet user =  users[i];
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println(user.getType());
            System.out.println(user.getAge());
        }
        System.out.println(responseString);
    }
}
