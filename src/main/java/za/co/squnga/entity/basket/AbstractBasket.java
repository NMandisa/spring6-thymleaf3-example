package za.co.squnga.entity.basket;

import jakarta.persistence.*;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@MappedSuperclass
public abstract class AbstractBasket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basket_generator")
    @SequenceGenerator(name = "basket_generator", sequenceName = "basket_sequence_name", allocationSize = 1)
    private Long id;
    public abstract Collection<? extends BasketItem> getBasketItems();
}
