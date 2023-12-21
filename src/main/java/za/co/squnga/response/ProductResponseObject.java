package za.co.squnga.response;

import lombok.*;

import java.math.BigDecimal;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class ProductResponseObject {

    private Long id;
    private String sku;
    private String name;
    private String description;
    private BigDecimal price;
}
