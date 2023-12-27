package za.co.squnga.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.order.Order;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
