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
@AllArgsConstructor
@ToString
@MappedSuperclass
public abstract class AbstractBasket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basket_generator")
    @SequenceGenerator(name = "basket_generator", sequenceName = "sequence_basket_id", allocationSize = 1)
    @Column(name = "basket_id")
    private Long basketId;
    public abstract Collection<? extends BasketItem> getBasketItems();
}
