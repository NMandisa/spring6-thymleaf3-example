package za.co.squnga.repository.basket;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.squnga.entity.basket.Basket;
import za.co.squnga.entity.basket.BasketItem;

import java.util.Optional;

/**
 * @author Noxolo.Mkhungo
 */
public interface BasketItemRepository extends JpaRepository<BasketItem,Long> {

    BasketItem findByBasket(Basket basket);
    @Override
    Optional<BasketItem> findById(Long aLong);
}
