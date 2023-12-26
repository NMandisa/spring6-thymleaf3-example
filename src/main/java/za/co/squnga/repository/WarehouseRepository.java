package za.co.squnga.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.Warehouse;
import za.co.squnga.repository.customs.CustomWarehouseRepository;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Long>, CustomWarehouseRepository {
    List<Warehouse> findAll();
}
