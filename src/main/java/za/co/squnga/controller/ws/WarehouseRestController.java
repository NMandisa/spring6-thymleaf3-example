package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.entity.Warehouse;
import za.co.squnga.entity.basket.Basket;
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

    @RequestMapping(WebRestURIConstants.GET_ALL_WAREHOUSES)
    public String warehouses(){
        LOGGER.atLevel(Level.DEBUG).log("warehouses","","",WarehouseRestController.class.getName());
        return "warehouses";
    }
    @RequestMapping(value = WebRestURIConstants.GET_WAREHOUSE,method = RequestMethod.POST)
    public String warehouseById(@PathVariable("id") Long id){
        return "warehouses-specific-warehouse-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.GET_WAREHOUSE_INVENTORY,method = RequestMethod.GET)
    public String warehouseInventory(@PathVariable("id") Long id){
        return "warehouse-inventory-specific-warehouse-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.CREATE_WAREHOUSE,method = RequestMethod.POST)
    public String addWarehouse(@RequestBody Warehouse warehouse){//will change it to reference dto in future
        return "creat-warehouse";
    }
    @RequestMapping(value = WebRestURIConstants.DELETE_WAREHOUSE,method = RequestMethod.DELETE)
    public String removeWarehouse(@PathVariable("id") Long id){//will change it to reference dto in future
        return "delete-warehouse";
    }
}
