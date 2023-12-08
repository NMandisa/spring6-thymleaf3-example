package za.co.squnga.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import za.co.squnga.entity.Warehouse;
import za.co.squnga.repository.WarehouseRepository;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class WarehouseFacade {
    private static final Logger LOGGER  = LoggerFactory.getLogger(WarehouseFacade.class.getName());
    private WarehouseRepository warehouseRepository;
    public List<Warehouse> getAllWarehouses(){
        return  warehouseRepository.findAll();
    }

}
