package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.entity.order.Order;
import za.co.squnga.entity.order.OrderItem;
import za.co.squnga.web.WebRestURIConstants;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.ORDERS_REST_MAPPING)
public class OrderRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(OrderRestController.class.getName());
    Map< String, Object > responseOrder = new LinkedHashMap<>();
    @RequestMapping(value = WebRestURIConstants.GET_ALL_ORDERS,method = RequestMethod.GET)
    public ResponseEntity<?> getOrders(){
        LOGGER.atLevel(Level.DEBUG).log("orders","","",CatalogRestController.class.getName());
        responseOrder.put("status",1);
        responseOrder.put("orders","[]");
        return new ResponseEntity<>(responseOrder,null, HttpStatus.OK);
    }
    @RequestMapping(value = WebRestURIConstants.GET_ORDER,method = RequestMethod.POST)
    public ResponseEntity<?> getOrderById(@PathVariable("order-id") Long orderId){
        responseOrder.put("status",1);
        responseOrder.put("orders","order-specific-order-using-id");
        return new ResponseEntity<>(responseOrder,null, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = WebRestURIConstants.ORDER_GET_ORDER_ITEMS,method = RequestMethod.GET)
    public ResponseEntity<?> getOrderItems(@PathVariable("order-id") Long orderId){
        responseOrder.put("status",1);
        responseOrder.put("orders","order-items-specific-order-using-id");
        return new ResponseEntity<>(responseOrder,null, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = WebRestURIConstants.ORDER_ADD_ORDER_ITEM,method = RequestMethod.GET)
    public ResponseEntity<?> addOrderItem(@PathVariable("order-id") Long orderId, OrderItem orderItem){
        responseOrder.put("status",1);
        responseOrder.put("orders","add order-items-specific-order-using-id");
        return new ResponseEntity<>(responseOrder,null, HttpStatus.CREATED);
    }
    @RequestMapping(value = WebRestURIConstants.ORDER_DELETE_ORDER_ITEM,method = RequestMethod.DELETE)
    public ResponseEntity<?> removeOrderItem(@PathVariable("order-id") Long orderId,@PathVariable("order-item-id") Long orderItemId){
        responseOrder.put("status",1);
        responseOrder.put("orders","remove order-items-specific-order-using-id");
        return new ResponseEntity<>(responseOrder,null, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = WebRestURIConstants.CREATE_ORDER,method = RequestMethod.POST)
    public ResponseEntity<?> addOrder(@RequestBody Order order){//will change it to reference dto in future
        responseOrder.put("status",1);
        responseOrder.put("orders","create-order");
        return new ResponseEntity<>(responseOrder,null, HttpStatus.CREATED);
    }
    @RequestMapping(value = WebRestURIConstants.DELETE_ORDER,method = RequestMethod.DELETE)
    public ResponseEntity<?> removeOrder(@PathVariable("order-id") Long id){//will change it to reference dto in future
        responseOrder.put("status",1);
        responseOrder.put("orders","delete-order");
        return new ResponseEntity<>(responseOrder,null, HttpStatus.ACCEPTED);
    }
}
