package za.co.squnga.entity.catalog;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@MappedSuperclass
public abstract class BaseCatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "catalog_generator")
    @SequenceGenerator(name = "catalog_generator", sequenceName = "sequence_catalog_id", allocationSize = 1)
    @Column(name = "catalog_id")
    private Long catalogId;
    public abstract Collection<? extends CatalogItem> getCatalogItems();
    public abstract void addCatalogItem(CatalogItem catalogItem);
    public abstract void removeCatalogItem(CatalogItem catalogItem);
}
