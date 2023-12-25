package za.co.squnga.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.entity.Warehouse;
import za.co.squnga.repository.customs.CustomWarehouseRepository;
import za.co.squnga.utils.HibernateUtil;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
@Transactional
public class DefaultWarehouseRepository implements CustomWarehouseRepository {
    private HibernateUtil hibernateUtil;
    @Autowired
    public HibernateUtil hibernateUtil(@Qualifier("hibernateUtil") HibernateUtil hibernateUtil){
        return this.hibernateUtil=hibernateUtil;
    }
    @Override
    public List<Warehouse> findAllOrderByNameASC() {
     return hibernateUtil.session().createQuery("SELECT p FROM Warehouse p", Warehouse.class).getResultList();
    }
}
