package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.entity.catalog.Catalog;
import za.co.squnga.web.WebRestURIConstants;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.CATALOGS_REST_MAPPING)
public class CatalogRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(CatalogRestController.class.getName());
    @RequestMapping(WebRestURIConstants.GET_ALL_CATALOGS)
    public String catalogs(){
        LOGGER.atLevel(Level.DEBUG).log("catalogs","","",CatalogRestController.class.getName());
        return "catalogs";
    }
    @RequestMapping(value = WebRestURIConstants.GET_WAREHOUSE,method = RequestMethod.POST)
    public String catalogById(@PathVariable("id") Long id){
        return "catalog-specific-catalog-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.GET_CATALOG_GET_CATALOG_ITEMS,method = RequestMethod.GET)
    public String catalogItems(@PathVariable("id") Long id){
        return "catalog-items-specific-catalog-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.CREATE_CATALOG,method = RequestMethod.POST)
    public String addCatalog(@RequestBody Catalog catalog){//will change it to reference dto in future
        return "create-catalog";
    }
    @RequestMapping(value = WebRestURIConstants.DELETE_CATALOG,method = RequestMethod.DELETE)
    public String removeCatalog(@PathVariable("id") Long id){//will change it to reference dto in future
        return "delete-catalog";
    }
}
