package za.co.squnga.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.product.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}