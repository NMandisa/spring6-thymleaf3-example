package za.co.squnga.entity.order;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_generator")
    @SequenceGenerator(name = "order_item_generator", sequenceName = "order_item_sequence_name", allocationSize = 1)
    private Long id;
}
