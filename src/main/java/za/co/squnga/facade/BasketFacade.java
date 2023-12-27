package za.co.squnga.facade;

import za.co.squnga.entity.basket.Basket;
import za.co.squnga.entity.basket.BasketItem;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */

public interface BasketFacade {

    Collection<?> getAllBaskets();
    Basket createBasket(Basket basket);
    void editBasket(Long basketId,Basket basket);
    void deleteBasket(Long basketId);
    Basket addBasketItem(Long basketId,BasketItem basketItem);
    void removeBasketItem(Long basketId,Long basketItemId);
}
