package za.co.squnga.entity;

import jakarta.persistence.*;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
public class BasketItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basket_item_generator")
    @SequenceGenerator(name = "basket_item_generator", sequenceName = "basket_item_sequence_name", allocationSize = 1)
    private Long id;
}
