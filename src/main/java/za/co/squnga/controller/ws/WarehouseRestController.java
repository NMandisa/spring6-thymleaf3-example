package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.entity.Inventory;
import za.co.squnga.entity.Warehouse;
import za.co.squnga.service.WarehouseService;
import za.co.squnga.web.WebRestURIConstants;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.WAREHOUSES_REST_MAPPING)
public class WarehouseRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(WarehouseRestController.class.getName());
    private  WarehouseService warehouseService;
    @Autowired
    public  WarehouseService warehouseService (@Qualifier("defaultWarehouseService") WarehouseService warehouseService){
        return this.warehouseService=warehouseService;
    }
    Map< String, Object > responseWarehouse= new LinkedHashMap<>();
    @RequestMapping(value = WebRestURIConstants.GET_ALL_WAREHOUSES,method = RequestMethod.GET)
    public ResponseEntity<?> warehouses(){
        LOGGER.atLevel(Level.DEBUG).log("warehouses","","",WarehouseRestController.class.getName());
        responseWarehouse.put("status",1);
        responseWarehouse.put("warehouses","[]");
        return new ResponseEntity<>(responseWarehouse,null, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = WebRestURIConstants.GET_WAREHOUSE,method = RequestMethod.POST)
    public ResponseEntity<?> warehouseById(@PathVariable("warehouse-id") Long warehouseId){
        responseWarehouse.put("status",1);
        responseWarehouse.put("warehouses","warehouses-specific-warehouse-using-id");
        return new ResponseEntity<>(responseWarehouse,null, HttpStatus.OK);
    }
    @RequestMapping(value = WebRestURIConstants.GET_WAREHOUSE_INVENTORY,method = RequestMethod.GET)
    public ResponseEntity<?> warehouseInventory(@PathVariable("warehouse-id") Long warehouseId){
        responseWarehouse.put("status",1);
        responseWarehouse.put("warehouses","warehouse-inventory-specific-warehouse-using-id");
        return new ResponseEntity<>(responseWarehouse,null, HttpStatus.OK);
    }
    @RequestMapping(value = WebRestURIConstants.CREATE_WAREHOUSE,method = RequestMethod.POST)
    public ResponseEntity<?> addWarehouse(@RequestBody Warehouse warehouse){//will change it to reference dto in future
        responseWarehouse.put("status",1);
        responseWarehouse.put("warehouses","create-warehouse");
        return new ResponseEntity<>(responseWarehouse,null, HttpStatus.CREATED);
    }
    @RequestMapping(value = WebRestURIConstants.DELETE_WAREHOUSE,method = RequestMethod.DELETE)
    public ResponseEntity<?> removeWarehouse(@PathVariable("warehouse-id") Long warehouseId){//will change it to reference dto in future
        responseWarehouse.put("status",1);
        responseWarehouse.put("warehouses","delete-warehouse");
        return new ResponseEntity<>(responseWarehouse,null, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = WebRestURIConstants.WAREHOUSE_ADD_INVENTORY,method = RequestMethod.POST)
    public ResponseEntity<?> addWarehouseInventory(@PathVariable("warehouse-id") Long warehouseId,@RequestBody Inventory inventory){//will change it to reference dto in future
        responseWarehouse.put("status",1);
        responseWarehouse.put("warehouses","add-inventory");
        return new ResponseEntity<>(responseWarehouse,null, HttpStatus.CREATED);
    }
    @RequestMapping(value = WebRestURIConstants.WAREHOUSE_DELETE_INVENTORY,method = RequestMethod.DELETE)
    public ResponseEntity<?> removeWarehouseInventory(@PathVariable("warehouse-id") Long warehouseId,@PathVariable("inventory-id") Long inventoryId){//will change it to reference dto in future
        responseWarehouse.put("status",1);
        responseWarehouse.put("warehouses","remove-inventory");
        return new ResponseEntity<>(responseWarehouse,null, HttpStatus.ACCEPTED);
    }
}
