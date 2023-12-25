package za.co.squnga.repository.customs;

import za.co.squnga.entity.Warehouse;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
public interface CustomWarehouseRepository {
    List<Warehouse> findAllOrderByNameASC();
}
