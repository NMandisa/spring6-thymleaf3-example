package za.co.squnga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.co.squnga.facade.HomePageFacade;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 *
 */
@Service
public class HomePageService {
    private final static Logger LOGGER = Logger.getLogger(HomePageService.class.getName());
    private HomePageFacade homePageFacade;
    @Autowired
    @Qualifier("homePageFacade")
    public void setHomepageFacade(HomePageFacade homePageFacade) {
        this.homePageFacade = homePageFacade;
    }

    public List listProducts(){
        return homePageFacade.getAllProducts();
    }

}
