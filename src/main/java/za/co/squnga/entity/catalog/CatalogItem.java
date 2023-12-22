package za.co.squnga.entity.catalog;

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
@Table(name = "catalog_item")
public class CatalogItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "catalog_item_generator")
    @SequenceGenerator(name = "catalog_item_generator", sequenceName = "sequence_catalog_item_id", allocationSize = 1)
    private Long id;
}
