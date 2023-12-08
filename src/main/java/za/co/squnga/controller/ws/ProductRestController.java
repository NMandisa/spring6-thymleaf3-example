package za.co.squnga.controller.ws;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.squnga.controller.ProductController;
import za.co.squnga.entity.Product;
import za.co.squnga.facade.HomePageFacade;
import za.co.squnga.service.ProductService;
import za.co.squnga.service.impl.DefaultProductService;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.logging.Level;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/products")
public class ProductRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(ProductRestController.class.getName());
    private ProductService productService;
    @Autowired
    public ProductService productService (){
        return productService=new DefaultProductService();
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List getProducts (){
        LOGGER.info("Products ............",ProductRestController.class.getName());
        // Page <Product> productPage = //services findAll
        //HttpHeaders headers = //PaginationUtils - pagination header (page, "/products/"
        //return new ResponseEntity<>(productPage.getContent,headers, httpStatus-OK
        return productService.ProductList();
    }
}
