package za.co.squnga.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
public class Catalog extends BaseCatalog{
    @OneToMany
    private Collection<CatalogItem> catalogItems;
    @Override
    public Collection<? extends CatalogItem> getCatalogItems() {
        return catalogItems;
    }
}
