package za.co.squnga.entity;

import javax.persistence.*;
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

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    @Column(name="warehouse_id")
    private Long warehouseId;

    @Column(name = "stock_id")
    protected Long stockId;


}