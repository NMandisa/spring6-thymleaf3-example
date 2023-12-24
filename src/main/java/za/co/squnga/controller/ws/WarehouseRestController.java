package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.squnga.service.WarehouseService;
import za.co.squnga.service.impl.DefaultWarehouseService;
import za.co.squnga.web.WebRestURIConstants;


/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.WAREHOUSES_REST_MAPPING)
public class WarehouseRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WarehouseRestController.class.getName());
    private WarehouseService warehouseService;
    @Autowired
    public  WarehouseService warehouseService (){
        return this.warehouseService=new DefaultWarehouseService();
    }
}
