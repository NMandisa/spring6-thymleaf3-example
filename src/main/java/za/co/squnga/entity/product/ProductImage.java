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
    private Long id;

    @Column(name = "product_image_url")
    private String productImageUrl;

    public  ProductImage(String productImageUrl){
        this.productImageUrl=productImageUrl;
    }
}
