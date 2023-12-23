package za.co.squnga;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Noxolo.Mkhungo
 */

public class AppTest 
{
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/application-context.xml");
    @Test
    public void contextLoadTest()
    {
        Assertions.assertNotNull(applicationContext);
    }
}
