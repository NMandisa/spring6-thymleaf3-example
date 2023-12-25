package za.co.squnga.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.entity.Product;
import za.co.squnga.repository.customs.CustomProductRepository;
import za.co.squnga.utils.HibernateUtil;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
@Transactional
public class DefaultProductRepository implements CustomProductRepository {
    private HibernateUtil hibernateUtil;
    @Autowired
    public HibernateUtil hibernateUtil(@Qualifier("hibernateUtil") HibernateUtil hibernateUtil){
        return this.hibernateUtil=hibernateUtil;
    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Product> findByNameOrDescription(String name, String description) {
        return null;
    }

    @Override
    public List<Product> findByNameAndDescription(String name, String description) {
        return null;
    }

    @Override
    public Product findDistinctByName(String name) {
        return null;
    }

    @Override
    public List<Product> findByPriceGreaterThan(BigDecimal price) {
        return null;
    }

    @Override
    public List<Product> findByPriceLessThan(BigDecimal price) {
        return null;
    }

    @Override
    public List<Product> findByNameContaining(String name) {
        return null;
    }

    @Override
    public List<Product> findByNameLike(String name) {
        return null;
    }

    @Override
    public List<Product> findByPriceBetween(BigDecimal startPrice, BigDecimal endPrice) {
        return null;
    }

    @Override
    public List<Product> findByDateCreatedBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return null;
    }

    @Override
    public List<Product> findByNameIn(List<String> names) {
        return null;
    }

    @Override
    public List<Product> findFirst2ByOrderByNameAsc() {
        return null;
    }

    @Override
    public List<Product> findTop2ByOrderByPriceDesc() {
        return null;
    }

    @Override
    public Product findByNameOrDescriptionJPQLIndexParam(String name, String description) {
        return null;
    }

    @Override
    public Product findByNameOrDescriptionJPQLNamedParam(String name, String description) {
        return null;
    }

    @Override
    public Product findByNameOrDescriptionSQLIndexParam(String name, String description) {
        return null;
    }

    @Override
    public Product findByNameOrDescriptionSQLNamedParam(String name, String description) {
        return null;
    }

    @Override
    public Product findByPrice(BigDecimal price) {
        return null;
    }

    @Override
    public List<Product> findAllOrderByNameDesc() {
        return null;
    }

    @Override
    public Product findByDescription(String description) {
        return null;
    }

    @Override
    public List<Product> findAllOrderByNameASC() {
        return hibernateUtil.session().createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }
}
