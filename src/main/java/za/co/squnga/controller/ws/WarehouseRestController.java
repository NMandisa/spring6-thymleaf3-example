package za.co.squnga.controller.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.squnga.service.WarehouseService;
import za.co.squnga.service.impl.DefaultWarehouseService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("api/warehouses/")
public class WarehouseRestController {
    private WarehouseService warehouseService;
    @Autowired
    public  WarehouseService warehouseService (){
        return this.warehouseService=new DefaultWarehouseService();
    }
}
