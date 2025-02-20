import com.ijinge.AnnotationApplicationContext;
import com.ijinge.ApplicationContext;
import com.ijinge.UserService;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelloWorldTest {

    @Test
    public void testIoc() {
        ApplicationContext applicationContext = new AnnotationApplicationContext("com.ijinge");
        UserService userService = (UserService)applicationContext.getBean(UserService.class);
        userService.out();
        System.out.println("run success");
    }
}
