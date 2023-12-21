package za.co.squnga.entity.basket;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "basket_item")
public class BasketItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basket_item_generator")
    @SequenceGenerator(name = "basket_item_generator", sequenceName = "basket_item_sequence_name", allocationSize = 1)
    private Long id;
}
