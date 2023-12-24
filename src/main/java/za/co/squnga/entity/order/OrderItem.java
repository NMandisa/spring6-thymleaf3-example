package za.co.squnga.entity.order;

import jakarta.persistence.*;
import lombok.*;
import za.co.squnga.entity.Return;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_generator")
    @SequenceGenerator(name = "order_item_generator", sequenceName = "sequence_order_item_id", allocationSize = 1)
    @Column(name = "order_item_id")
    private Long orderItemId;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(name = "returned_order_items",joinColumns = @JoinColumn(name = "order_item_id", referencedColumnName = "order_item_id"),
            inverseJoinColumns = @JoinColumn(name = "return_id", referencedColumnName = "return_id",foreignKey=@ForeignKey(name = "return_order_item_fk")))
    private Return aReturn;
    @ManyToOne
    @JoinTable(name = "order_order_items",joinColumns = @JoinColumn(name = "order_item_id", referencedColumnName = "order_item_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "order_id",foreignKey=@ForeignKey(name = "ordered_order_item_fk")))
    private Order order;
}
