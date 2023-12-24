package za.co.squnga.controller.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.squnga.web.WebRestURIConstants;


/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WebRestURIConstants.BASKETS_REST_MAPPING)
public class BasketRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(BasketRestController.class.getName());
}
