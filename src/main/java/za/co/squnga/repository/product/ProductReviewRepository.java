package za.co.squnga.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.product.ProductReview;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface ProductReviewRepository extends JpaRepository<ProductReview,Long> {
}
