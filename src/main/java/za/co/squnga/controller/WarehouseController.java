package za.co.squnga.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.squnga.facade.HomePageFacade;
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
