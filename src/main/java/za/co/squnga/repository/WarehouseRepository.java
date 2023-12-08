package za.co.squnga.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.Warehouse;

/**
 * @author Noxolo.Mkhungo
 */

public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {

}
