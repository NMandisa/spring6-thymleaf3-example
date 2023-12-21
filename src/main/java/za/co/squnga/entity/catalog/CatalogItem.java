package za.co.squnga.entity.catalog;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    @SequenceGenerator(name = "catalog_item_generator", sequenceName = "catalog_item_sequence_name", allocationSize = 1)
    private Long id;
}
