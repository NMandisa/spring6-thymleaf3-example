package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.entity.basket.Basket;
import za.co.squnga.web.WebRestURIConstants;


/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.BASKETS_REST_MAPPING)
public class BasketRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(BasketRestController.class.getName());
    @RequestMapping(WebRestURIConstants.GET_ALL_BASKETS)
    public String baskets(){
        LOGGER.atLevel(Level.DEBUG).log("baskets",BasketRestController.class.getName());
        return "baskets";
    }
    @RequestMapping(value = WebRestURIConstants.GET_BASKET,method = RequestMethod.POST)
    public String basketById(@PathVariable("id") Long id){
        LOGGER.atLevel(Level.DEBUG).log("baskets-specific-basket-using-id",BasketRestController.class.getName());
        return "baskets-specific-basket-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.GET_BASKET_GET_BASKET_ITEMS,method = RequestMethod.GET)
    public String basketItems(@PathVariable("id") Long id){
        return "basket-items-baskets-specific-basket-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.CREATE_BASKET,method = RequestMethod.POST)
    public String addBasket(@RequestBody Basket basket){//will change it to reference dto in future
        return "creat-basket";
    }
    @RequestMapping(value = WebRestURIConstants.DELETE_BASKET,method = RequestMethod.DELETE)
    public String removeBasket(@PathVariable("id") Long id){//will change it to reference dto in future
        return "delete-basket";
    }

}
