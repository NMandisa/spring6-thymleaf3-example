package za.co.squnga.entity.catalog;

import jakarta.persistence.*;
import lombok.*;
import za.co.squnga.entity.product.Product;

import java.util.Collection;

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
    @Column(name = "catalog_item_id")
    private Long catalogItemId;
    @ManyToOne
    @JoinColumn
    @JoinTable(name = "catalog_item_belong_catalog",joinColumns = @JoinColumn(name = "catalog_item_id", referencedColumnName = "catalog_item_id"),
            inverseJoinColumns = @JoinColumn(name = "catalog_id", referencedColumnName = "catalog_id",foreignKey=@ForeignKey(name = "catalog_item_catalog_fk")))
    private Catalog catalog;
    @ManyToMany
    @JoinTable(name = "catalog_item_has_product",joinColumns = @JoinColumn(name = "catalog_item_id", referencedColumnName = "catalog_item_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "product_id",foreignKey=@ForeignKey(name = "catalog_item_product_fk")))
    private Collection<Product> product;
}
