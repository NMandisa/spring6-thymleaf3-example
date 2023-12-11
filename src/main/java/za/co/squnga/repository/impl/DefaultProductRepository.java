package za.co.squnga.repository.impl;

import org.springframework.stereotype.Repository;
import za.co.squnga.entity.Product;
import za.co.squnga.repository.CustomProductRepository;
import za.co.squnga.repository.ProductRepository;

import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public class DefaultProductRepository implements CustomProductRepository {
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
        return null;
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
