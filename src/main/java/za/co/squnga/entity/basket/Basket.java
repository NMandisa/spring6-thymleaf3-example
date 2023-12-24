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
@Entity
@Table(name = "basket")
public class Basket extends AbstractBasket {
    @OneToMany(mappedBy = "basket")
    /*@JoinTable(name = "basket_has_basket_items",joinColumns = @JoinColumn(name = "basket_id", referencedColumnName = "basket_id"),
            inverseJoinColumns = @JoinColumn(name = "basket_item_id", referencedColumnName = "basket_item_id",foreignKey=@ForeignKey(name = "basket_basket_item_fk")))*/
    private Collection<BasketItem>  basketItems;
    @Override
    public Collection<? extends BasketItem> getBasketItems() {
        return basketItems;
    }
}
