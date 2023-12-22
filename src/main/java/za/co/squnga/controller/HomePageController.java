package za.co.squnga.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author Noxolo.Mkhungo
 */
@Controller
public class HomePageController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(HomePageController.class);
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index (HttpServletRequest httpRequest){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "You're in Home Page Controller");
        LOGGER.debug("You're in Home Page Controller");
        return modelAndView;
    }

}
