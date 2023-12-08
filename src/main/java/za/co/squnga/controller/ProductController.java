package za.co.squnga.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import za.co.squnga.facade.HomePageFacade;
import za.co.squnga.service.ProductService;
import za.co.squnga.service.impl.DefaultProductService;

/**
 * @author Noxolo.Mkhungo
 */
@Controller
public class ProductController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(ProductController.class.getName());
    private ProductService productService;
    @Autowired
    public ProductService productService (){
        return this.productService=new DefaultProductService();
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ModelAndView index (HttpServletRequest httpRequest){
        ModelAndView modelAndView = new ModelAndView("product-listing-page");
        LOGGER.info("------>>>>>>>>> ",HomePageController.class.getName());
        modelAndView.addObject("message", "You're in Product Page Controller");
        LOGGER.info("You're in Product Page Controller",ProductController.class.getName());
        return modelAndView;
    }


}
