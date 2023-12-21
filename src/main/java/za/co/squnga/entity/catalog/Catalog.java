package za.co.squnga.entity.catalog;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "catalog")
public class Catalog extends BaseCatalog{
    @OneToMany
    @JoinTable(name = "catalog_has_catalog_items")
    private Collection<CatalogItem> catalogItems;
    @Override
    public Collection<? extends CatalogItem> getCatalogItems() {
        return catalogItems;
    }
}
