package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.entity.basket.Basket;
import za.co.squnga.entity.basket.BasketItem;
import za.co.squnga.web.WebRestURIConstants;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.BASKETS_REST_MAPPING)
public class BasketRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(BasketRestController.class.getName());
    Map< String, Object > responseBasket= new LinkedHashMap<>();
    @RequestMapping(value = WebRestURIConstants.GET_ALL_BASKETS,method = RequestMethod.GET)
    public ResponseEntity<?> baskets(){
        LOGGER.info("baskets",BasketRestController.class.getName());
        responseBasket.put("status",1);
        responseBasket.put("baskets","[]");
        return new ResponseEntity<>(responseBasket,null, HttpStatus.OK);
    }
    @RequestMapping(value = WebRestURIConstants.GET_BASKET,method = RequestMethod.POST)
    public ResponseEntity<?> basketById(@PathVariable("basket-id") Long basketId){
        LOGGER.atLevel(Level.DEBUG).log("baskets-specific-basket-using-id",BasketRestController.class.getName());
        responseBasket.put("status",1);
        responseBasket.put("baskets","baskets-specific-basket-using-id");
        return new ResponseEntity<>(responseBasket,null, HttpStatus.OK);
    }
    @RequestMapping(value = WebRestURIConstants.GET_BASKET_ITEMS,method = RequestMethod.GET)
    public ResponseEntity<?> showBasketItems(@PathVariable("basket-id") Long basketId){
        responseBasket.put("status",1);
        responseBasket.put("baskets","basket-items-baskets-specific-basket-using-id");
        return new ResponseEntity<>(responseBasket,null, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = WebRestURIConstants.REMOVE_BASKET_ITEMS,method = RequestMethod.DELETE)
    public ResponseEntity<?> removeBasketItems(@PathVariable("basket-id") Long basketId,@PathVariable("basket-item-id") Long basketItemId) {
        responseBasket.put("status",1);
        responseBasket.put("baskets","remove basket item");
        return new ResponseEntity<>(responseBasket,null, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = WebRestURIConstants.ADD_BASKET_ITEMS,method = RequestMethod.POST)
    public ResponseEntity<?> addBasketItems(@PathVariable("basket-id") Long basketId,@RequestBody BasketItem basketItem){
        responseBasket.put("status",1);
        responseBasket.put("baskets","add basket item");
        return new ResponseEntity<>(responseBasket,null, HttpStatus.CREATED);
    }
    @RequestMapping(value = WebRestURIConstants.CREATE_BASKET,method = RequestMethod.POST)
    public ResponseEntity<?> addBasket(@RequestBody Basket basket){//will change it to reference dto in future
        responseBasket.put("status",1);
        responseBasket.put("baskets","create-basket");
        return new ResponseEntity<>(responseBasket,null, HttpStatus.CREATED);
    }
    @RequestMapping(value = WebRestURIConstants.DELETE_BASKET,method = RequestMethod.DELETE)
    public ResponseEntity<?> removeBasket(@PathVariable("basket-id") Long basketId){//will change it to reference dto in future
        responseBasket.put("status",1);
        responseBasket.put("baskets","delete-basket");
        return new ResponseEntity<>(responseBasket,null, HttpStatus.ACCEPTED);
    }

}
