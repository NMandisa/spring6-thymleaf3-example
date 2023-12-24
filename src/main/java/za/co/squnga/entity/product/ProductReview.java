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
public class ProductReview {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_review_generator")
    @SequenceGenerator(name = "product_review_generator", sequenceName = "sequence_product_review_id", allocationSize = 1)
    @Column(name = "product_review_id")
    private Long productReviewId;
    @Column(name = "product_rating")
    private int productRating;
    @Column(name = "product_review")
    private int productReview;
    @ManyToOne
    @JoinTable(name = "product_review_belong_product",joinColumns = @JoinColumn(name = "product_review_id", referencedColumnName = "product_review_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "product_id",foreignKey=@ForeignKey(name = "product_review_product_fk")))
    private BaseProduct product;
}
