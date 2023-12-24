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
    @Column(name = "stock_id")
    private Long stockId;
    @OneToMany
    @JoinTable(name = "stock_belongs_to_inventory",joinColumns = @JoinColumn(name = "stock_id", referencedColumnName = "stock_id"),
            inverseJoinColumns = @JoinColumn(name = "inventory_id", referencedColumnName = "inventory_id",foreignKey=@ForeignKey(name = "stock_inventory_fk")))
    private Collection<Inventory> inventories;
}
