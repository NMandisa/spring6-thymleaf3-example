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
    @OneToMany(mappedBy = "order")
    private Collection<OrderItem> orderItems;
    @OneToOne
    @JoinTable(name = "order_has_order_detail",joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "order_detail_id", referencedColumnName = "order_detail_jd",foreignKey=@ForeignKey(name = "order_order_detail_fk")))
    private OrderDetail orderDetail;

    @Override
    public Collection<? extends OrderItem> getOrderItems() {return orderItems;}

    @Override
    public void addOrderDetail(OrderDetail orderDetail) {
        this.orderDetail=orderDetail;
        orderDetail.setOrder(this);
    }

    @Override
    public void removeOrderDetail(OrderDetail orderDetail) {
        this.orderDetail=orderDetail;
        orderDetail.setOrder(null);
    }
    @Override
    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
    @Override
    public void removeOrderItem(OrderItem orderItem) {
        orderItems.remove(orderItem);
        orderItem.setOrder(null);
    }
}
