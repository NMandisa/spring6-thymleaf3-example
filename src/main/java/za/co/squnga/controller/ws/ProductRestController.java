package za.co.squnga.controller.ws;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.dto.ProductDTO;
import za.co.squnga.service.ProductService;
import za.co.squnga.web.WebRestURIConstants;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.PRODUCTS_REST_MAPPING)
public class ProductRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductRestController.class.getName());
    private ProductService productService;
    @Autowired
    public ProductService productService (@Qualifier("defaultProductService") ProductService productService)
    {return this.productService=productService;}
    @RequestMapping(
            value = WebRestURIConstants.GET_ALL_PRODUCTS,
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity <?> productList (){
        LOGGER.debug("Products ............");
        // Page <Product> productPage = //services findAll
        HttpHeaders headers = new HttpHeaders();//PaginationUtils - pagination header (page, "/products/");
        //return new ResponseEntity<>(productPage.getContent,headers, httpStatus-OK
        Map< String, Object > responseProduct= new LinkedHashMap<>();
        if( Objects.isNull(productService.ProductList())) {
            responseProduct.put("status",0);
            responseProduct.put("products",null);
            return new ResponseEntity<>(responseProduct,null,HttpStatus.FAILED_DEPENDENCY);
        }
            responseProduct.put("status",1);
            responseProduct.put("products",productService.ProductList());
            return new ResponseEntity<>(responseProduct,null,HttpStatus.ACCEPTED);
    }

    @PostMapping(value = WebRestURIConstants.CREATE_PRODUCT, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity <?> createProduct(@RequestBody ProductDTO productDTO){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
