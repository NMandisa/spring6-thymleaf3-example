package za.co.squnga.entity.catalog;

import jakarta.persistence.*;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@MappedSuperclass
public abstract class BaseCatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "catalog_generator")
    @SequenceGenerator(name = "catalog_generator", sequenceName = "sequence_catalog_id", allocationSize = 1)
    private Long id;
    public abstract Collection<? extends CatalogItem> getCatalogItems();
}
