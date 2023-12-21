package za.co.squnga.entity.order;

import jakarta.persistence.*;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@MappedSuperclass
public abstract class AbstractOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_generator")
    @SequenceGenerator(name = "order_generator", sequenceName = "order_sequence_name", allocationSize = 1)
    private Long id;
    public abstract OrderDetail getorderDetail();
    public abstract Collection<? extends OrderItem> getOrderItems();




}
