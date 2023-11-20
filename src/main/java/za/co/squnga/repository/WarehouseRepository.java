package za.co.squnga.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import za.co.squnga.entity.Warehouse;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {
    List<Warehouse> findAll();
}
