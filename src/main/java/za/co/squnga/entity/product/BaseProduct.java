package za.co.squnga.entity.product;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import za.co.squnga.entity.basket.BasketItem;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "base_product")
public class BaseProduct extends AbstractProduct {
    @OneToOne
    private ProductDetail productDetail;
    @OneToMany
    private Collection<ProductImage>  productImages;
    @Override
    public ProductDetail getProductDetail() {
        return productDetail;
    }
    @Override
    public Collection<? extends ProductImage> getProductImages() {
        return productImages;
    }
}
