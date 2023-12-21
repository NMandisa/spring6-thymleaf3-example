package za.co.squnga.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
public class ShoppingBasket extends Basket{
    @OneToMany
    private Collection<BasketItem>  basketItems;
    @Override
    public Collection<? extends BasketItem> getBasketItems() {
        return basketItems;
    }
}
