package za.co.squnga.entity.basket;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@MappedSuperclass
public abstract class Basket {
    @Id
    @GeneratedValue
    private int id;
    public abstract Collection<? extends BasketItem> getBasketItems();
}
