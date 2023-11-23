package za.co.squnga.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.squnga.service.HomePageService;

import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("api/products/")
public class ProductController {
    private final static Logger LOGGER = Logger.getLogger(ProductController.class.getName());
    private HomePageService homePageService;
    @Autowired
    @Qualifier("homePageService")
    public void setHomePageServuce (HomePageService homePageService){
        this.homePageService=homePageService;
    }
}
