package za.co.squnga.entity.brand;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@MappedSuperclass
public abstract class AbstractBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_generator")
    @SequenceGenerator(name = "brand_generator", sequenceName = "sequence_brand_id", allocationSize = 1)
    @Column(name = "brand_id")
    private Long BrandId;
}
