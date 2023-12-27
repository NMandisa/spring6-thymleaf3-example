package za.co.squnga.repository.brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.brand.FeaturedBrand;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface FeaturedBrandRepository extends JpaRepository<FeaturedBrand, Long> {
}
