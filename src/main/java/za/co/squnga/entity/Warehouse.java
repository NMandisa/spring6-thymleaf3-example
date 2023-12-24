package za.co.squnga.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;
import za.co.squnga.enums.WarehouseType;
import za.co.squnga.enums.converter.WarehouseTypeConverter;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
@Setter
@Getter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "warehouse" ,schema = "hellodb")
public class Warehouse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "warehouse_generator")
    @SequenceGenerator(name = "warehouse_generator", sequenceName = "sequence_warehouse_id", allocationSize = 1)
    @Column(name = "warehouse_id")
    private Long warehouseId;

    @Column(name="warehouse_name")
    private String warehouseName;

    @Column(name="warehouse_type")
    @Enumerated(EnumType.STRING)
    @Convert(converter = WarehouseTypeConverter.class)
    private WarehouseType warehouseType;

    @OneToOne
    @JoinTable(name = "warehouse_has_inventory",joinColumns = @JoinColumn(name = "warehouse_id", referencedColumnName = "warehouse_id"),
            inverseJoinColumns = @JoinColumn(name = "inventory_id", referencedColumnName = "inventory_id",foreignKey=@ForeignKey(name = "warehouse_inventory_fk")))
    private Inventory inventory;

}