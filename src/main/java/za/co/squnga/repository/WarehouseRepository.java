package za.co.squnga.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.entity.Warehouse;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
@Transactional
public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {
    List<Warehouse> findAll();
}
