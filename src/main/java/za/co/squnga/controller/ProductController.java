package za.co.squnga.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.squnga.entity.Product;
import za.co.squnga.service.ProductService;
import za.co.squnga.service.impl.DefaultProductService;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@Controller
public class ProductController {
    private final static Logger LOGGER = Logger.getLogger(ProductController.class.getName());
    private ProductService productService;
    @Autowired
    public ProductService productService (){
        return this.productService=new DefaultProductService();
    }

    @RequestMapping(value = "/products/list", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getProducts (HttpServletRequest httpRequest){
        // Page <Product> productPage = //services findAll
        //HttpHeaders headers = //PaginationUtils - pagination header (page, "/products/"
        //return new ResponseEntity<>(productPage.getContent,headers, httpStatus-OK
        return null;
    }
}
