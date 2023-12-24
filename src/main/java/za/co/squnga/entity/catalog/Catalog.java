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
    @Column(name = "catalog_name")
    private String catalogName;

    @OneToMany(mappedBy = "catalog")
    private Collection<CatalogItem> catalogItems;
    @Override
    public Collection<? extends CatalogItem> getCatalogItems() {
        return catalogItems;
    }
    @Override
    public void addCatalogItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
        catalogItem.setCatalog(this);
    }
    @Override
    public void removeCatalogItem(CatalogItem catalogItem) {
        catalogItems.remove(catalogItem);
        catalogItem.setCatalog(null);
    }
}
