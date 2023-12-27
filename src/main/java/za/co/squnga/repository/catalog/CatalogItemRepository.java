package za.co.squnga.repository.catalog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.catalog.CatalogItem;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface CatalogItemRepository extends JpaRepository<CatalogItem, Long> {
}
