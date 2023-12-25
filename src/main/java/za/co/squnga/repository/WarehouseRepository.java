package za.co.squnga.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import za.co.squnga.entity.Warehouse;
import za.co.squnga.repository.customs.CustomWarehouseRepository;

/**
 * @author Noxolo.Mkhungo
 */
@NoRepositoryBean
public interface WarehouseRepository extends JpaRepository<Warehouse,Long>, CustomWarehouseRepository {

}
