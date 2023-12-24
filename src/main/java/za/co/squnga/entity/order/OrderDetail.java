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
    @Column(name = "order_detail_id")
    private Long orderDetailId;
    @OneToOne
    @JoinColumn
    @JoinTable(name = "order_has_order_detail",joinColumns = @JoinColumn(name = "order_detail_id", referencedColumnName = "order_detail_id"),
            inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "order_id",foreignKey=@ForeignKey(name = "order_detail_order_fk")))
    private Order order;

}
