package za.co.squnga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.product.BaseProduct;
@Repository
public interface BaseProductRepository extends JpaRepository<BaseProduct, Long> {
}