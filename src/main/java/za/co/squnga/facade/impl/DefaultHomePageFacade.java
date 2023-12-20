package za.co.squnga.facade.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import za.co.squnga.facade.HomePageFacade;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class DefaultHomePageFacade implements HomePageFacade{
    private static final Logger LOGGER  = LoggerFactory.getLogger(HomePageFacade.class.getName());
}
