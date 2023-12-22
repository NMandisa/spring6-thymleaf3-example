package za.co.squnga.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import za.co.squnga.service.WarehouseService;
import za.co.squnga.service.impl.DefaultWarehouseService;

/**
 * @author Noxolo.Mkhungo
 */
@Controller
public class WarehouseController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(WarehouseController.class.getName());
    private WarehouseService warehouseService;
    @Autowired
    public  WarehouseService warehouseService (){
        return this.warehouseService=new DefaultWarehouseService();
    }
}
