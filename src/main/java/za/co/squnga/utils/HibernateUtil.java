package za.co.squnga.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class HibernateUtil {
    private SessionFactory sessionFactory;
    @Autowired
    public SessionFactory sessionFactory(SessionFactory sessionFactory){
        return this.sessionFactory=sessionFactory;
    }

    public Session session(){
        return sessionFactory.getCurrentSession();
    }
}
