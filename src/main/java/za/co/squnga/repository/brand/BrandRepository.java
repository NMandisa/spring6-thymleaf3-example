package za.co.squnga.repository.brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.brand.Brand;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
