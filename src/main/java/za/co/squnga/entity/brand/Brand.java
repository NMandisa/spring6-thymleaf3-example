package za.co.squnga.entity.brand;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "brand")
public class Brand extends AbstractBrand{
}
