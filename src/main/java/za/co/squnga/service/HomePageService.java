package za.co.squnga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import za.co.squnga.facade.HomPageFacade;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 *
 */
@Service
@ComponentScan("za.co.squnga.service")
public class HomePageService {
    private final static Logger LOGGER = Logger.getLogger(HomePageService.class.getName());
    /*@Autowired
    private final HomPageFacade homPageFacade;*/

    /*public HomePageService(HomPageFacade homPageFacade) {
        this.homPageFacade = homPageFacade;
    }*/

    /*public List listProducts(){
        return homPageFacade.getAllProducts();
    }*/

}
