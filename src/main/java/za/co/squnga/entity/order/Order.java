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
    @JoinTable(name = "order_has_order_detail",joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "order_detail_id", referencedColumnName = "id",foreignKey=@ForeignKey(name = "order_order_detail_fk")))
    private OrderDetail orderDetail;
    @Override
    public OrderDetail getorderDetail() {return orderDetail;}
    @Override
    public Collection<? extends OrderItem> getOrderItems() {return orderItems;}
}
