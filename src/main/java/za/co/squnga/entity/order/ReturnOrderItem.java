package za.co.squnga.entity.order;

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
public class ReturnOrderItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "return_generator")
    @SequenceGenerator(name = "return_generator", sequenceName = "sequence_return_id", allocationSize = 1)
    @Column(name = "return_id")
    private Long returnId;
    @OneToMany(mappedBy = "aReturn")
    private Collection<OrderItem> orderItems;
}
