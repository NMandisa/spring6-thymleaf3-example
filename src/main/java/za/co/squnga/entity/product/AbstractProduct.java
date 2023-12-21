package za.co.squnga.entity.product;

import jakarta.persistence.*;
import za.co.squnga.entity.basket.BasketItem;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@MappedSuperclass
public abstract class AbstractProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_detail_generator")
    @SequenceGenerator(name = "product_detail_generator", sequenceName = "product_image_sequence_name", allocationSize = 1)
    private Long id;

    public abstract ProductDetail getProductDetail();
    public abstract Collection<? extends ProductImage> getProductImages();
}
