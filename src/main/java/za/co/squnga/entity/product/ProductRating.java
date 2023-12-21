package za.co.squnga.entity.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "product_review")
public class ProductRating {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_review_generator")
    @SequenceGenerator(name = "product_review_generator", sequenceName = "product_review_sequence_name", allocationSize = 1)
    private Long id;
    @Column(name = "product_rating")
    private int productRating;
    @Column(name = "product_review")
    private int productReview;

}
