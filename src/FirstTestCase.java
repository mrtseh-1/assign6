// 1. Setup - open the browser and application
// 2. login
// 3. close
//



        import org.testng.annotations.Test;

public class FirstTestCase {

    @Test
    void setup() {
        System.out.println("Opening browser");
    }

    @Test
    void login() {
        System.out.println("This is login test");
    }

    @Test
    void teardown() {
        System.out.println("Closing browser");
    }

}
