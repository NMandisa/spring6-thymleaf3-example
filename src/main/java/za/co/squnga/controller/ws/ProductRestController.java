package za.co.squnga.controller.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.squnga.controller.ProductController;
import za.co.squnga.service.ProductService;
import za.co.squnga.service.impl.DefaultProductService;

import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("api/products/")
public class ProductRestController {

    private final static Logger LOGGER = Logger.getLogger(ProductController.class.getName());
    private ProductService productService;
    @Autowired
    public ProductService productService (){
        return this.productService=new DefaultProductService();
    }
}
