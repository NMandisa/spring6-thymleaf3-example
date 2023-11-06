package za.co.squnga.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Level;

/**
 * @author Noxolo.Mkhungo
 *
 */
@Controller
public class HomePageController {

    private final static Logger LOGGER = LoggerFactory.getLogger(HomePageController.class);



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index (HttpServletRequest httpRequest){

        ModelAndView modelAndView = new ModelAndView("index");

        LOGGER.info("public ModelAndView todoMethod(HttpServletRequest httpRequest){" +modelAndView.getView(),HomePageController.class);
        modelAndView.addObject("message", "You're in HomePage Contoller");
        LOGGER.info("You're in HomePage Contoller",HomePageController.class);
        return modelAndView;
        //return null;
    }
}
