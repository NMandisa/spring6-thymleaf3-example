package za.co.squnga.entity.catalog;

import jakarta.persistence.*;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "catalog")
public class Catalog extends BaseCatalog{
    @OneToMany
    private Collection<CatalogItem> catalogItems;
    @Override
    public Collection<? extends CatalogItem> getCatalogItems() {
        return catalogItems;
    }
}
