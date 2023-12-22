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
@Table(name = "product_detail")
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_detail_generator")
    @SequenceGenerator(name = "product_detail_generator", sequenceName = "product_image_sequence_name", allocationSize = 1)
    private Long id;
}
