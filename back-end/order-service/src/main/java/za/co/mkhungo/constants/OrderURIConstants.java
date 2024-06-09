package za.co.mkhungo.constants;

/**
 * @author Noxolo.Mkhungo
 */
public class OrderURIConstants {

  private OrderURIConstants() {}
  public static final String ORDER_REST_MAPPING = "/nav";
  public static final String GET_ALL_ORDERS = "/";
  public static final String GET_ORDER = "/{id}";
  public static final String CREATE_ORDER = "/";
  public static final String PATCH_ORDER = "/{id}";
  public static final String DELETE_ORDER = "/{id}";
}
