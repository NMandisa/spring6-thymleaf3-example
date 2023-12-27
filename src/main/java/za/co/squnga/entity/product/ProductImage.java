package za.co.squnga.entity.product;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_image_generator")
    @SequenceGenerator(name = "product_image_generator", sequenceName = "sequence_product_image_id", allocationSize = 1)
    @Column(name = "product_image_id")
    private Long productImageId;

    @Column(name = "product_image_url")
    private String productImageUrl;

    @ManyToOne
    @JoinTable(name = "product_has_product_reviewa",joinColumns = @JoinColumn(name = "product_image_id", referencedColumnName = "product_image_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "product_id",foreignKey=@ForeignKey(name = "product_image_product_fk")))
    private Product product;

    public  ProductImage(String productImageUrl){
        this.productImageUrl=productImageUrl;
    }
}
