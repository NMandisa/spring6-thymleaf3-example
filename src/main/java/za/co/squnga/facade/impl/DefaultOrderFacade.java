package za.co.squnga.facade.impl;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.squnga.controller.HomePageController;
import za.co.squnga.facade.OrderFacade;

import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@PropertySource("classpath:/messages/messages.properties")
public class DefaultOrderFacade implements OrderFacade {
    private static final Logger LOGGER  = Logger.getLogger(OrderFacade.class.getName());
}
