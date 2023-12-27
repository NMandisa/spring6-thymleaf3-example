package za.co.squnga.repository.catalog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.catalog.Catalog;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long> {
}
