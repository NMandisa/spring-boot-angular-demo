package za.co.mkhungo.constants;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductRatingURIConstants {
  private ProductRatingURIConstants() {}
  public static final String PRODUCT_RATING_REST_MAPPING = "/product-ratings";
  public static final String GET_ALL_PRODUCT_RATINGS = "/";
  public static final String GET_PRODUCT_RATING = "/{id}";
  public static final String CREATE_PRODUCT_RATING = "/create";
  public static final String DELETE_PRODUCT_RATING = "/delete/{id}";
}
