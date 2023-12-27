package za.co.squnga.repository.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.squnga.entity.order.OrderDetail;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
