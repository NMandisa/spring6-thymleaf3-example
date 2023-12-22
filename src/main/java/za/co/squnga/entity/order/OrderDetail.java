package za.co.squnga.entity.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_detail_generator")
    @SequenceGenerator(name = "order_detail_generator", sequenceName = "sequence_order_detail_id", allocationSize = 1)
    private Long id;
}
