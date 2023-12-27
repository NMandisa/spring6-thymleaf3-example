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
@Table(name = "product")
public class Product extends AbstractProduct {
    @Column(name = "product_name")
    private String productName;
    @OneToOne
    @JoinTable(name = "product_has_product_detail",joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "product_detail_id", referencedColumnName = "product_detail_id",foreignKey=@ForeignKey(name = "product_product_detail_fk")))
    private ProductDetail productDetail;
    @OneToMany(mappedBy = "product")
    /*@JoinTable(name = "product_has_product_images",joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "product_image_id", referencedColumnName = "product_image_id",foreignKey=@ForeignKey(name = "product_product_image_fk")))*/
    private Collection<ProductImage>  productImages;
    @OneToMany(mappedBy = "product")
    /*@JoinTable(name = "product_has_product_reviewa",joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "product_review_id", referencedColumnName = "product_review_id",foreignKey=@ForeignKey(name = "product_product_review_fk")))*/
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
