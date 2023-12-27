package za.co.squnga.facade.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.squnga.facade.CatalogFacade;
import za.co.squnga.repository.catalog.CatalogItemRepository;
import za.co.squnga.repository.catalog.CatalogRepository;


/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
public class DefaultCatalogFacade implements CatalogFacade {
    private static final Logger LOGGER  = LoggerFactory.getLogger(CatalogFacade.class.getName());
    private CatalogRepository catalogRepository;
    private CatalogItemRepository catalogItemRepository;
    @Autowired
    public DefaultCatalogFacade(CatalogRepository catalogRepository,CatalogItemRepository catalogItemRepository){
        super();
        this.catalogItemRepository=catalogItemRepository;
        this.catalogRepository=catalogRepository;
    }

}
