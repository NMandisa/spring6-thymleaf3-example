package za.co.squnga.entity.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    @Column(name = "product_name")
    private String productName;
    @OneToOne
    @JoinTable(name = "product_has_product_detail")
    private ProductDetail productDetail;
    @OneToMany
    @JoinTable(name = "product_has_product_images")
    private Collection<ProductImage>  productImages;
    @OneToMany
    @JoinTable(name = "product_has_product_reviews")
    private Collection<ProductReview> productReviews;
    @Override
    public Collection<? extends ProductReview> getProductRatings() {
        return productReviews;
    }
    @Override
    public ProductDetail getProductDetail() {
        return productDetail;
    }
    @Override
    public Collection<? extends ProductImage> getProductImages() {
        return productImages;
    }
}
