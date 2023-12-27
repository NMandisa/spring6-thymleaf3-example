package za.co.squnga.repository.basket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.basket.Basket;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface BasketRepository extends JpaRepository<Basket,Long> {
}
