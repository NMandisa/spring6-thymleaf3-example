package za.co.squnga.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.order.OrderItem;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
