package za.co.squnga.facade.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.squnga.facade.OrderFacade;
import za.co.squnga.repository.order.OrderDetailRepository;
import za.co.squnga.repository.order.OrderItemRepository;
import za.co.squnga.repository.order.OrderRepository;
import za.co.squnga.repository.order.ReturnOrderItemRepository;


/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
public class DefaultOrderFacade implements OrderFacade {
    private static final Logger LOGGER  = LoggerFactory.getLogger(OrderFacade.class.getName());
    private OrderRepository orderRepository;
    private OrderDetailRepository orderDetailRepository;
    private OrderItemRepository orderItemRepository;
    private ReturnOrderItemRepository returnOrderItemRepository;
    @Autowired
    public DefaultOrderFacade(OrderRepository orderRepository,OrderDetailRepository orderDetailRepository,OrderItemRepository orderItemRepository,ReturnOrderItemRepository returnOrderItemRepository){
        super();
        this.orderRepository=orderRepository;
        this.orderDetailRepository=orderDetailRepository;
        this.orderItemRepository=orderItemRepository;
        this.returnOrderItemRepository=returnOrderItemRepository;
    }

}
