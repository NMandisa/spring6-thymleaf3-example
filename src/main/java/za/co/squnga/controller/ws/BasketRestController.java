package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.entity.basket.Basket;
import za.co.squnga.entity.basket.BasketItem;
import za.co.squnga.web.WebRestURIConstants;


/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.BASKETS_REST_MAPPING)
public class BasketRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(BasketRestController.class.getName());
    @RequestMapping(value = WebRestURIConstants.GET_ALL_BASKETS,method = RequestMethod.GET)
    public String baskets(){
        LOGGER.info("baskets",BasketRestController.class.getName());
        return "baskets";
    }
    @RequestMapping(value = WebRestURIConstants.GET_BASKET,method = RequestMethod.POST)
    public String basketById(@PathVariable("basket-id") Long basketId){
        LOGGER.atLevel(Level.DEBUG).log("baskets-specific-basket-using-id",BasketRestController.class.getName());
        return "baskets-specific-basket-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.GET_BASKET_ITEMS,method = RequestMethod.GET)
    public String showBasketItems(@PathVariable("basket-id") Long basketId){
        return "basket-items-baskets-specific-basket-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.REMOVE_BASKET_ITEMS,method = RequestMethod.DELETE)
    public String removeBasketItems(@PathVariable("basket-id") Long basketId,@PathVariable("basket-item-id") Long basketItemId) {
        return "remove basket item";
    }
    @RequestMapping(value = WebRestURIConstants.ADD_BASKET_ITEMS,method = RequestMethod.POST)
    public String addBasketItems(@PathVariable("basket-id") Long basketId,@RequestBody BasketItem basketItem){
        return "add basket item";
    }
    @RequestMapping(value = WebRestURIConstants.CREATE_BASKET,method = RequestMethod.POST)
    public String addBasket(@RequestBody Basket basket){//will change it to reference dto in future
        return "create-basket";
    }
    @RequestMapping(value = WebRestURIConstants.DELETE_BASKET,method = RequestMethod.DELETE)
    public String removeBasket(@PathVariable("basket-id") Long basketId){//will change it to reference dto in future
        return "delete-basket";
    }

}
