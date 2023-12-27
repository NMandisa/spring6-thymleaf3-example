package za.co.squnga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.Stock;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {
}
