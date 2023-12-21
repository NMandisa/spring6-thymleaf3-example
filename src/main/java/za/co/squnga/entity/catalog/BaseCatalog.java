package za.co.squnga.entity.catalog;

import jakarta.persistence.*;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@MappedSuperclass
public abstract class BaseCatalog {
    @Id
    @GeneratedValue
    private int id;
    public abstract Collection<? extends CatalogItem> getCatalogItems();
}
