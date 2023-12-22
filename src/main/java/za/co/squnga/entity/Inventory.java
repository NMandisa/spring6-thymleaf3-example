package za.co.squnga.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventory_generator")
    @SequenceGenerator(name = "inventory_generator", sequenceName = "sequence_inventory_id", allocationSize = 1)
    private Long id;
    private int inventoryAmount;
    private Long warehouseId;
    @OneToOne
    @JoinTable(name = "inventory_belongs_warehouse")
    private Warehouse warehouse;

}
