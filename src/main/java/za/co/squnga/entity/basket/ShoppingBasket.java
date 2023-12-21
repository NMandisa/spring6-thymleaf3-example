package za.co.squnga.entity.basket;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "shopping_basket")
public class ShoppingBasket extends AbstractBasket {
    @OneToMany
    @JoinTable(name = "shopping_basket_has_basket_items")
    private Collection<BasketItem>  basketItems;
    @Override
    public Collection<? extends BasketItem> getBasketItems() {
        return basketItems;
    }
}
