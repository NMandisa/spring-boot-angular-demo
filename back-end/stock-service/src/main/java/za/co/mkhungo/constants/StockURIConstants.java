package za.co.mkhungo.constants;

/**
 * @author Noxolo.Mkhungo
 */
public class StockURIConstants {

  private StockURIConstants() {}
  public static final String SROCK_REST_MAPPING = "/stocks";
  public static final String GET_ALL_STOCKS = "/";
  public static final String GET_STOCK = "/{id}";
  public static final String PATCH_STOCK = "/{id}";
  public static final String CREATE_STOCK = "/create";
  public static final String DELETE_STOCK = "/delete/{id}";
}
