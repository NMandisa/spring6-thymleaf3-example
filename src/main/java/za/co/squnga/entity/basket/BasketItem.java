package za.co.squnga.entity.basket;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "basket_item")
public class BasketItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basket_item_generator")
    @SequenceGenerator(name = "basket_item_generator", sequenceName = "sequence_basket_item_id", allocationSize = 1)
    private Long id;
}
