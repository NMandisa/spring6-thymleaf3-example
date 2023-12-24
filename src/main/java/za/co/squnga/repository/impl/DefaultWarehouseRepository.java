package za.co.squnga.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import za.co.squnga.repository.custom.CustomWarehouseRepository;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
@Transactional
public class DefaultWarehouseRepository implements CustomWarehouseRepository {
}
