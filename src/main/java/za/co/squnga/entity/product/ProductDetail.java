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
    @SequenceGenerator(name = "product_detail_generator", sequenceName = "sequence_product_detail_id", allocationSize = 1)
    @Column(name = "product_detail_id")
    private Long productDetailId;
    @OneToOne
    @JoinTable(name = "product_detail_belong_product",joinColumns = @JoinColumn(name = "product_detail_id", referencedColumnName = "product_detail_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "product_id",foreignKey=@ForeignKey(name = "product_detail_product_fk")))
    private BaseProduct product;
}
