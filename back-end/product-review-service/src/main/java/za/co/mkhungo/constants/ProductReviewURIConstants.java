package za.co.mkhungo.constants;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductReviewURIConstants {
  private ProductReviewURIConstants() {}
  public static final String PRODUCT_REVIEW_REST_MAPPING = "/product-reviews";
  public static final String GET_ALL_PRODUCT_REVIEWS = "/";
  public static final String GET_PRODUCT_REVIEW = "/{id}";
  public static final String CREATE_PRODUCT_REVIEW = "/create";
  public static final String DELETE_PRODUCT_REVIEW = "/delete/{id}";
}
