package za.co.squnga.entity.order;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "order_history")
public class OrderHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_history_generator")
    @SequenceGenerator(name = "order_history_generator", sequenceName = "order_history_sequence_name", allocationSize = 1)
    private Long id;
}
