package za.co.squnga.web;

/**
 * @author Noxolo.Mkhungo
 */
public class WebRestURIConstants {
    public static final String PRODUCTS_REST_MAPPING = "/rest/products";
    public static final String GET_ALL_PRODUCTS = PRODUCTS_REST_MAPPING+"/";
    public static final String GET_PRODUCT = PRODUCTS_REST_MAPPING+"/{id}";
    public static final String CREATE_PRODUCT = PRODUCTS_REST_MAPPING+"/create";
    public static final String DELETE_PRODUCT = PRODUCTS_REST_MAPPING+"/delete/{id}";
}
