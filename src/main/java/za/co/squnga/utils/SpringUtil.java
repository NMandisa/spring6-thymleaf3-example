package za.co.squnga.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
public class SpringUtil implements ApplicationContextAware {

    private final static Logger LOGGER = Logger.getLogger(SpringUtil.class.getName());
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringUtil.applicationContext == null) {
            LOGGER.log(Level.INFO,"setApplicationContext ------------->", SpringUtil.class);
            SpringUtil.applicationContext = applicationContext;
        }
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void removeExistingAndAddNewBean(String beanId) {

        AutowireCapableBeanFactory factory = applicationContext.getAutowireCapableBeanFactory();
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) factory;
        registry.removeBeanDefinition(beanId);

        //create newBeanObj through GenericBeanDefinition
        //registry.registerBeanDefinition(beanId, newBeanObj);
    }
    public static Object getBean(String beanId) {
        return applicationContext.getBean(beanId);
    }

    public static <T> T getBean(String beanId, Class<T> beanClass) {
        return applicationContext.getBean(beanId, beanClass);
    }
}
