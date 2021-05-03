import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class TestExample {

    @Test(groups = "test-example")
    public void test(){
        System.out.println("this test was executed");
    }
}
