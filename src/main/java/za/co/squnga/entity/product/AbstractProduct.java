package za.co.squnga.entity.product;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@MappedSuperclass
public abstract class AbstractProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator")
    @SequenceGenerator(name = "product_generator", sequenceName = "sequence_product_id", allocationSize = 1)
    @Column(name = "product_id")
    private Long productId;
    public abstract Collection<? extends ProductReview> getProductRatings();
    public abstract ProductDetail getProductDetail();
    public abstract Collection<? extends ProductImage> getProductImages();
}
