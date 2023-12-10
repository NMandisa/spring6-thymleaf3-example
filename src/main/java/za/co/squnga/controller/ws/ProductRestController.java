package za.co.squnga.controller.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.squnga.dto.ProductDTO;
import za.co.squnga.service.ProductService;
import za.co.squnga.service.impl.DefaultProductService;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("/products")
public class ProductRestController {
    private static final Logger LOGGER = Logger.getLogger(ProductRestController.class.getName());
    private ProductService productService;
    @Autowired
    public ProductService productService (){
        return productService=new DefaultProductService();
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<ProductDTO>> productList (){
        LOGGER.info("Products ............");
        // Page <Product> productPage = //services findAll
        //HttpHeaders headers = PaginationUtils - pagination header (page, "/products/");
        //return new ResponseEntity<>(productPage.getContent,headers, httpStatus-OK
        return new ResponseEntity<>(productService.ProductList(),HttpStatus.OK);
    }

    /*@PostMapping(value = "/", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO){
        return new ResponseEntity<ProductDTO>(HttpStatus.OK);
    }*/
}
