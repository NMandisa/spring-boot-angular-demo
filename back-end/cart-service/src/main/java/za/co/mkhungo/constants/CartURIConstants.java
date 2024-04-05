package za.co.mkhungo.constants;

/**
 * @author Noxolo.Mkhungo
 */
public class CartURIConstants {

  private CartURIConstants() {}
  public static final String CART_REST_MAPPING = "/carts";
  public static final String GET_ALL_CARTS = "/";
  public static final String GET_CART = "/{id}";
  public static final String CREATE_CART = "/create";
  public static final String DELETE_CART = "/delete/{id}";
}
