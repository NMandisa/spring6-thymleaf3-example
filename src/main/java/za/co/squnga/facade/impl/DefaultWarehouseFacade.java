package za.co.squnga.facade.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.squnga.entity.Warehouse;
import za.co.squnga.facade.WarehouseFacade;
import za.co.squnga.repository.InventoryRepository;
import za.co.squnga.repository.StockRepository;
import za.co.squnga.repository.WarehouseRepository;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class DefaultWarehouseFacade implements WarehouseFacade{
    private static final Logger LOGGER  = LoggerFactory.getLogger(WarehouseFacade.class.getName());
    private WarehouseRepository warehouseRepository;
    private StockRepository stockRepository;
    private InventoryRepository inventoryRepository;
    @Autowired
    public DefaultWarehouseFacade(WarehouseRepository warehouseRepository,StockRepository stockRepository,InventoryRepository inventoryRepository)
    {
        this.warehouseRepository=warehouseRepository;
        this.inventoryRepository=inventoryRepository;
        this.stockRepository=stockRepository;
    }
    public Collection<Warehouse> getAllWarehouses(){
        return  warehouseRepository.findAll();
    }
}
