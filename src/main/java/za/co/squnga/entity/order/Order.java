package za.co.squnga.entity.order;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "order")
public class Order extends AbstractOrder{
    @OneToMany
    @JoinTable(name = "order_has_order_items")
    private Collection<OrderItem> orderItems;
    @OneToOne
    @JoinTable(name = "order_has_order_detail")
    private OrderDetail orderDetail;
    @Override
    public OrderDetail getorderDetail() {return orderDetail;}
    @Override
    public Collection<? extends OrderItem> getOrderItems() {return orderItems;}
}
