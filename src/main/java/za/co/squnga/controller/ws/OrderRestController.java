package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.entity.order.Order;
import za.co.squnga.entity.order.OrderItem;
import za.co.squnga.web.WebRestURIConstants;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.ORDERS_REST_MAPPING)
public class OrderRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(OrderRestController.class.getName());
    @RequestMapping(value = WebRestURIConstants.GET_ALL_ORDERS,method = RequestMethod.GET)
    public String orders(){
        LOGGER.atLevel(Level.DEBUG).log("orders","","",CatalogRestController.class.getName());
        return "orders";
    }
    @RequestMapping(value = WebRestURIConstants.GET_ORDER,method = RequestMethod.POST)
    public String orderById(@PathVariable("order-id") Long orderId){
        return "order-specific-order-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.ORDER_GET_ORDER_ITEMS,method = RequestMethod.GET)
    public String orderItems(@PathVariable("order-id") Long orderId){
        return "order-items-specific-order-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.ORDER_ADD_ORDER_ITEM,method = RequestMethod.GET)
    public String orderItems(@PathVariable("order-id") Long orderId, OrderItem orderItem){
        return "add order-items-specific-order-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.ORDER_DELETE_ORDER_ITEM,method = RequestMethod.DELETE)
    public String orderItems(@PathVariable("order-id") Long orderId,@PathVariable("order-item-id") Long orderItemId){
        return "remove order-items-specific-order-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.CREATE_ORDER,method = RequestMethod.POST)
    public String addOrder(@RequestBody Order order){//will change it to reference dto in future
        return "create-order";
    }
    @RequestMapping(value = WebRestURIConstants.DELETE_ORDER,method = RequestMethod.DELETE)
    public String removeOrder(@PathVariable("order-id") Long id){//will change it to reference dto in future
        return "delete-order";
    }
}
