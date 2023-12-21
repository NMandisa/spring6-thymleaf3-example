package za.co.squnga.entity.basket;

import jakarta.persistence.*;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "shopping_basket")
public class ShoppingBasket extends Basket{
    @OneToMany
    private Collection<BasketItem>  basketItems;
    @Override
    public Collection<? extends BasketItem> getBasketItems() {
        return basketItems;
    }
}
