package za.co.squnga.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import za.co.squnga.facade.HomePageFacade;

import java.util.logging.Level;

/**
 * @author Noxolo.Mkhungo
 */
@Controller
public class HomePageController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(HomePageController.class.getName());
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index (HttpServletRequest httpRequest){
        ModelAndView modelAndView = new ModelAndView("index");
        LOGGER.info("------>>>>>>>>> ",HomePageController.class.getName());
        modelAndView.addObject("message", "You're in Home Page Controller");
        LOGGER.info("You're in Home Page Controller",HomePageController.class.getName());
        return modelAndView;
    }

}
