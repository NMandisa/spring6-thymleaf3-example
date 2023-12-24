package za.co.squnga.entity.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import za.co.squnga.entity.catalog.CatalogItem;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@MappedSuperclass
public abstract class AbstractOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_generator")
    @SequenceGenerator(name = "order_generator", sequenceName = "sequence_order_id", allocationSize = 1)
    @Column(name = "order_id")
    private Long orderId;
    public abstract Collection<? extends OrderItem> getOrderItems();
    public abstract void addOrderDetail(OrderDetail orderDetail);
    public abstract void removeOrderDetail(OrderDetail orderDetail);
    public abstract void addOrderItem(OrderItem orderItem);
    public abstract void removeOrderItem(OrderItem orderItem);

}
