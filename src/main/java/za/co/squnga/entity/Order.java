package za.co.squnga.entity;

import jakarta.persistence.*;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_generator")
    @SequenceGenerator(name = "order_generator", sequenceName = "order_sequence_name", allocationSize = 1)
    private Long id;
    @OneToMany
    private Collection<OrderItem> orderItems;
    public Collection<? extends OrderItem> getOrderItems() {
        return orderItems;
    }
}
