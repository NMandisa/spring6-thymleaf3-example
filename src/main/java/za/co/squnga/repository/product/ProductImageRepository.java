package za.co.squnga.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.product.ProductImage;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface ProductImageRepository extends JpaRepository<ProductImage,Long> {
}
