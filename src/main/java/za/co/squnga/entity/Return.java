package za.co.squnga.entity;

import jakarta.persistence.*;
import lombok.*;
import za.co.squnga.entity.order.OrderItem;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "return")
public class Return implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "return_generator")
    @SequenceGenerator(name = "return_generator", sequenceName = "sequence_return_id", allocationSize = 1)
    private Long id;

    @OneToMany
    @JoinTable(name = "return_has_order_items")
    private Collection<OrderItem> orderItems;
}
