package za.co.squnga.entity;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_generator")
    @SequenceGenerator(name = "order_item_generator", sequenceName = "order_item_sequence_name", allocationSize = 1)
    private Long id;
}
