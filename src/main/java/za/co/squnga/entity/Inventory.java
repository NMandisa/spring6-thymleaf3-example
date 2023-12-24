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
@AllArgsConstructor
@ToString
@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventory_generator")
    @SequenceGenerator(name = "inventory_generator", sequenceName = "sequence_inventory_id", allocationSize = 1)
   @Column(name = "inventory_id")
    private Long inventoryId;
    private int inventoryAmount;
    @OneToOne
    @JoinTable(name = "warehouse_has_inventory",joinColumns = @JoinColumn(name = "inventory_id", referencedColumnName = "inventory_id"),
            inverseJoinColumns = @JoinColumn(name = "warehouse_id", referencedColumnName = "warehouse_id",foreignKey=@ForeignKey(name = "warehouse_inventory_fk")))
    private Warehouse warehouse;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Stock stock;

}
