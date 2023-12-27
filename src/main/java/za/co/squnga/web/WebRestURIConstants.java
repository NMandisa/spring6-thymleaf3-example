package za.co.squnga.web;

/**
 * @author Noxolo.Mkhungo
 */
public class WebRestURIConstants {
    public static final String PRODUCTS_REST_MAPPING = "/api/products";
    public static final String GET_ALL_PRODUCTS = "/";
    public static final String GET_PRODUCT = "/{id}";
    public static final String CREATE_PRODUCT = "/create";
    public static final String DELETE_PRODUCT = "//delete/{id}";
    public static final String WAREHOUSES_REST_MAPPING = "/api/warehouses";
    public static final String GET_ALL_WAREHOUSES = "/";
    public static final String GET_WAREHOUSE = "/{warehouse-id}";
    public static final String GET_WAREHOUSE_INVENTORY = "/{warehouse-id}/inventories";
    public static final String WAREHOUSE_ADD_INVENTORY = "/{warehouse-id}/inventories/create";
    public static final String WAREHOUSE_DELETE_INVENTORY = "/{warehouse-id}/inventories/{inventory-id}";
    public static final String CREATE_WAREHOUSE = "/create";
    public static final String DELETE_WAREHOUSE = "/delete/{warehouse-id}";
    public static final String CATALOGS_REST_MAPPING = "/api/catalogs";
    public static final String GET_ALL_CATALOGS = "/";
    public static final String GET_CATALOG = "/{catalog-id}";
    public static final String GET_CATALOG_GET_CATALOG_ITEMS  = "/{catalog-id}/catalog-items";
    public static final String CREATE_CATALOG = "/create";
    public static final String DELETE_CATALOG = "/delete/{catalog-id}";
    public static final String ADD_CATALOG_ITEM  = "/{catalog-id}/catalog-items/create";
    public static final String REMOVE_CATALOG_ITEM  = "/{catalog-id}/catalog-items/catalog-item-id";
    public static final String BASKETS_REST_MAPPING = "/api/baskets";
    public static final String GET_ALL_BASKETS = "/";
    public static final String GET_BASKET = "/{basket-id}";
    public static final String GET_BASKET_ITEMS  = "/{basket-id}/basket-items";
    public static final String ADD_BASKET_ITEMS  = "/{basket-id}/basket-items/create";
    public static final String REMOVE_BASKET_ITEMS  = "/{basket-id}/basket-items/{basket-item-id}";
    public static final String CREATE_BASKET = "/create";
    public static final String DELETE_BASKET = "/delete/{basket-id}";
    public static final String ORDERS_REST_MAPPING = "/api/orders";
    public static final String GET_ALL_ORDERS = "/";
    public static final String GET_ORDER = "/{order-id}";
    public static final String ORDER_GET_ORDER_ITEMS  = "/{order-id}/order-items";
    public static final String ORDER_ADD_ORDER_ITEM  = "/{order-id}/order-items/create";
    public static final String ORDER_DELETE_ORDER_ITEM  = "/{order-id}/order-items/{order-item-id}";
    public static final String CREATE_ORDER = "/create";
    public static final String DELETE_ORDER = "/delete/{order-id}";

}
