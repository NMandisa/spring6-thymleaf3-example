package za.co.squnga.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "warehouse")
public class Warehouse implements Serializable{


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="warehouse_id")
    private Long warehouseId;

    @Column(name = "stock_id")
    protected Long stockId;


}