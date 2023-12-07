package za.co.squnga.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@Controller
public class HomePageController {
    private final static Logger LOGGER = Logger.getLogger(HomePageController.class.getName());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index (HttpServletRequest httpRequest){
        ModelAndView modelAndView = new ModelAndView("index");
        LOGGER.log(Level.INFO,"------>>>>>>>>> ",HomePageController.class);
        modelAndView.addObject("message", "You're in Home Page Controller");
        LOGGER.log(Level.INFO,"You're in Home Page Controller",HomePageController.class);
        return modelAndView;
    }

}
