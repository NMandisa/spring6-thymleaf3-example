package za.co.squnga.entity;

import jakarta.persistence.*;
import lombok.*;
import za.co.squnga.enums.WarehouseType;

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
    @SequenceGenerator(name = "warehouse_generator", sequenceName = "warehouse_sequence_name", allocationSize = 1)
    private Long id;

    @Column(name="warehouse_name")
    private String warehouseName;

    @Column(name="warehouse_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private WarehouseType warehouseType;

}