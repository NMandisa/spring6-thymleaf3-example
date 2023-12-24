package za.co.squnga.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import za.co.squnga.entity.Warehouse;
import za.co.squnga.repository.custom.CustomWarehouseRepository;

/**
 * @author Noxolo.Mkhungo
 */
public interface WarehouseRepository extends JpaRepository<Warehouse,Long>, CustomWarehouseRepository {

}
