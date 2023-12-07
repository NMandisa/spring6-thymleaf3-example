package za.co.squnga;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import za.co.squnga.utils.SpringUtil;


/**
 * @author Noxolo.Mkhungo
 */
/*@ExtendWith(Spring.class)
@ContextConfiguration(locations = {"classpath:/application-context.xml"})*/
public class AppTest 
{
    @Test
    public void contextLoadTest()
    {

        /*SpringUtil springUtil =new SpringUtil();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/application-context.xml");
        springUtil.setApplicationContext(applicationContext);

        Assertions.assertTrue( true );*/
    }
    private ApplicationContext applicationContext;

    /*@Test
    void givenAppContext_WhenInjected_ThenItShouldNotBeNull() {
        assertNotNull(applicationContext);
    }*/
}
