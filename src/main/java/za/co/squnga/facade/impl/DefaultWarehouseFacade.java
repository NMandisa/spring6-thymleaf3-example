package za.co.squnga.facade.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import za.co.squnga.entity.Warehouse;
import za.co.squnga.facade.WarehouseFacade;
import za.co.squnga.repository.WarehouseRepository;

import java.util.Collection;
import java.util.Set;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class DefaultWarehouseFacade implements WarehouseFacade{
    private static final Logger LOGGER  = LoggerFactory.getLogger(WarehouseFacade.class.getName());
    private WarehouseRepository warehouseRepository;
    /*@Autowired
    public WarehouseRepository warehouseRepository(@Qualifier("warehouseRepository") WarehouseRepository warehouseRepository)
    {return this.warehouseRepository=warehouseRepository;}*/
    public Collection<Warehouse> getAllWarehouses(){
        return  warehouseRepository.findAll();
    }
}
