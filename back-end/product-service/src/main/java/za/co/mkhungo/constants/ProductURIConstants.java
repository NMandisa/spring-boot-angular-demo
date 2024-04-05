package za.co.mkhungo.constants;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductURIConstants {
  private ProductURIConstants() {}
  public static final String PRODUCT_REST_MAPPING = "/products";
  public static final String GET_ALL_PRODUCTS = "/";
  public static final String GET_PRODUCT = "/{id}";
  public static final String CREATE_PRODUCT = "/create";
  public static final String DELETE_PRODUCT = "/delete/{id}";
}
