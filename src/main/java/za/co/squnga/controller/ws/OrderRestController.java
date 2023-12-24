package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.entity.catalog.Catalog;
import za.co.squnga.web.WebRestURIConstants;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.ORDERS_REST_MAPPING)
public class OrderRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(OrderRestController.class.getName());
    @RequestMapping(WebRestURIConstants.GET_ALL_ORDERS)
    public String orders(){
        LOGGER.atLevel(Level.DEBUG).log("catalogs","","",CatalogRestController.class.getName());
        return "orders";
    }
    @RequestMapping(value = WebRestURIConstants.GET_ORDER,method = RequestMethod.POST)
    public String orderById(@PathVariable("id") Long id){
        return "order-specific-order-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.GET_ORDER_GET_ORDER_ITEMS,method = RequestMethod.GET)
    public String orderItems(@PathVariable("id") Long id){
        return "order-items-specific-order-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.CREATE_ORDER,method = RequestMethod.POST)
    public String addOrder(@RequestBody Catalog catalog){//will change it to reference dto in future
        return "creat-order";
    }
    @RequestMapping(value = WebRestURIConstants.DELETE_ORDER,method = RequestMethod.DELETE)
    public String removeOrder(@PathVariable("id") Long id){//will change it to reference dto in future
        return "delete-order";
    }
}
