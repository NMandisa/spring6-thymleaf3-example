package za.co.squnga.entity.order;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "order_history")
public class OrderHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_history_generator")
    @SequenceGenerator(name = "order_history_generator", sequenceName = "sequence_order_history_id", allocationSize = 1)
    private Long id;
}
