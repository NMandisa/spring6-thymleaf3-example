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
@ToString
@Entity
@Table(name = "sample")
public class Sample implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sample_generator")
    @SequenceGenerator(name = "sample_generator", sequenceName = "sequence_sample_id", allocationSize = 1)
    private Long id;
}
