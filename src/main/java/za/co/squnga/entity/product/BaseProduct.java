package za.co.squnga.entity.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import za.co.squnga.entity.basket.BasketItem;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "base_product")
public class BaseProduct extends AbstractProduct {
    @OneToOne
    @JoinTable(name = "product_has_product_detail")
    private ProductDetail productDetail;
    @OneToMany
    @JoinTable(name = "product_has_product_images")
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
