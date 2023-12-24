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
@RequestMapping(WebRestURIConstants.ORDERS_REST_MAPPING)
public class OrderRestController {
    private static final Logger LOGGER  = LoggerFactory.getLogger(OrderRestController.class.getName());
}
