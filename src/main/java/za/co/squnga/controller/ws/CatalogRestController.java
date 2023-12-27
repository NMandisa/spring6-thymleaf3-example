package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.entity.catalog.Catalog;
import za.co.squnga.entity.catalog.CatalogItem;
import za.co.squnga.web.WebRestURIConstants;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.CATALOGS_REST_MAPPING)
public class CatalogRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(CatalogRestController.class.getName());
    Map< String, Object > responseCatalog= new LinkedHashMap<>();
    @RequestMapping(value = WebRestURIConstants.GET_ALL_CATALOGS,method = RequestMethod.GET)
    public ResponseEntity<?> getCatalogs(){
        LOGGER.atLevel(Level.DEBUG).log("catalogs","","",CatalogRestController.class.getName());
        responseCatalog.put("status",1);
        responseCatalog.put("catalogs","[]");
        return new ResponseEntity<>(responseCatalog,null, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = WebRestURIConstants.GET_CATALOG,method = RequestMethod.POST)
    public ResponseEntity <?> getCatalogById(@PathVariable("catalog-id") Long catalogId){
        responseCatalog.put("status",1);
        responseCatalog.put("catalogs","catalog-specific-catalog-using-id");
        return new ResponseEntity<>(responseCatalog,null, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = WebRestURIConstants.GET_CATALOG_GET_CATALOG_ITEMS,method = RequestMethod.GET)
    public ResponseEntity <?> getCatalogItems(@PathVariable("catalog-id") Long catalogId){
        responseCatalog.put("status",1);
        responseCatalog.put("catalogs","catalog-items-specific-catalog-using-id");
        return new ResponseEntity<>(responseCatalog,null, HttpStatus.ACCEPTED);
    }
    @RequestMapping(value = WebRestURIConstants.CREATE_CATALOG,method = RequestMethod.POST)
    public ResponseEntity <?> addCatalog(@RequestBody Catalog catalog){//will change it to reference dto in future
        responseCatalog.put("status",1);
        responseCatalog.put("catalogs","create-catalog");
        return new ResponseEntity<>(responseCatalog,null, HttpStatus.CREATED);
    }
    @RequestMapping(value = WebRestURIConstants.DELETE_CATALOG,method = RequestMethod.DELETE)
    public ResponseEntity <?> removeCatalog(@PathVariable("catalog-id") Long catalogId){//will change it to reference dto in future
        responseCatalog.put("status",1);
        responseCatalog.put("catalogs","delete-catalog");
        return new ResponseEntity<>(responseCatalog,null, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = WebRestURIConstants.ADD_CATALOG_ITEM,method = RequestMethod.POST)
    public ResponseEntity <?> addCatalogItem(@PathVariable("catalog-id") Long catalogId,@RequestBody CatalogItem catalogItem){//will change it to reference dto in future
        responseCatalog.put("status",1);
        responseCatalog.put("catalogs","create-catalog-item");
        return new ResponseEntity<>(responseCatalog,null, HttpStatus.CREATED);
    }
    @RequestMapping(value = WebRestURIConstants.REMOVE_CATALOG_ITEM,method = RequestMethod.DELETE)
    public ResponseEntity <?> removeCatalogItem(@PathVariable("catalog-id") Long catalogId,@PathVariable("catalog-item-id") Long id){//will change it to reference dto in future
        responseCatalog.put("status",1);
        responseCatalog.put("catalogs","delete-catalog-item");
        return new ResponseEntity<>(responseCatalog,null, HttpStatus.ACCEPTED);
    }
}
