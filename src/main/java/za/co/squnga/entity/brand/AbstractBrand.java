package za.co.squnga.entity.brand;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@MappedSuperclass
public abstract class AbstractBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_generator")
    @SequenceGenerator(name = "brand_generator", sequenceName = "sequence_brand_id", allocationSize = 1)
    private Long id;
}
