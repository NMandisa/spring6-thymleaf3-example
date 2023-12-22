package za.co.squnga.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "stock")
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stock_generator")
    @SequenceGenerator(name = "stock_generator", sequenceName = "sequence_stock_id", allocationSize = 1)
    private Long id;
    @OneToMany
    @JoinTable(name = "stock_belongs_to_inventory")
    private Collection<Inventory> inventories;
}
