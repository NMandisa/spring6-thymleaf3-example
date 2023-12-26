package za.co.squnga.facade.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.squnga.facade.BasketFacade;

import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
public class DefaultBasketFacade implements BasketFacade {
    private static final Logger LOGGER  = Logger.getLogger(BasketFacade.class.getName());
}
