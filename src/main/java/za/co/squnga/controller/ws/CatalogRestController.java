package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.entity.catalog.Catalog;
import za.co.squnga.entity.catalog.CatalogItem;
import za.co.squnga.web.WebRestURIConstants;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.CATALOGS_REST_MAPPING)
public class CatalogRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(CatalogRestController.class.getName());
    @RequestMapping(value = WebRestURIConstants.GET_ALL_CATALOGS,method = RequestMethod.GET)
    public String catalogs(){
        LOGGER.atLevel(Level.DEBUG).log("catalogs","","",CatalogRestController.class.getName());
        return "catalogs";
    }
    @RequestMapping(value = WebRestURIConstants.GET_CATALOG,method = RequestMethod.POST)
    public String catalogById(@PathVariable("catalog-id") Long catalogId){
        return "catalog-specific-catalog-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.GET_CATALOG_GET_CATALOG_ITEMS,method = RequestMethod.GET)
    public String catalogItems(@PathVariable("catalog-id") Long catalogId){
        return "catalog-items-specific-catalog-using-id";
    }
    @RequestMapping(value = WebRestURIConstants.CREATE_CATALOG,method = RequestMethod.POST)
    public String addCatalog(@RequestBody Catalog catalog){//will change it to reference dto in future
        return "create-catalog";
    }
    @RequestMapping(value = WebRestURIConstants.DELETE_CATALOG,method = RequestMethod.DELETE)
    public String removeCatalog(@PathVariable("catalog-id") Long catalogId){//will change it to reference dto in future
        return "delete-catalog";
    }

    @RequestMapping(value = WebRestURIConstants.ADD_CATALOG_ITEM,method = RequestMethod.POST)
    public String addCatalogItem(@PathVariable("catalog-id") Long catalogId,@RequestBody CatalogItem catalogItem){//will change it to reference dto in future
        return "create-catalog-item";
    }
    @RequestMapping(value = WebRestURIConstants.REMOVE_CATALOG_ITEM,method = RequestMethod.DELETE)
    public String removeCatalogItem(@PathVariable("catalog-id") Long catalogId,@PathVariable("catalog-item-id") Long id){//will change it to reference dto in future
        return "delete-catalog-item";
    }
}
