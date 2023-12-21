package za.co.squnga.entity.order;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_detail_generator")
    @SequenceGenerator(name = "order_detail_generator", sequenceName = "order_detail_sequence_name", allocationSize = 1)
    private Long id;
}
