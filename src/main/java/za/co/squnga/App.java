package za.co.squnga;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import za.co.squnga.utils.SpringUtil;
import za.co.squnga.web.WebConstants;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 *
 */
public class App
{
    private final static Logger LOGGER = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        LOGGER.log(Level.INFO,"Initializing Spring context.", App.class);
        SpringUtil springUtil =new SpringUtil();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/application-context.xml");
        springUtil.setApplicationContext(applicationContext);
    }
}
