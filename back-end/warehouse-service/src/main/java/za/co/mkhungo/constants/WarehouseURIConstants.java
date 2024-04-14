package za.co.mkhungo.constants;

/**
 * @author Noxolo.Mkhungo
 */
public class WarehouseURIConstants {

  private WarehouseURIConstants() {}
  public static final String WAREHOUSE_REST_MAPPING = "/warehouses";
  public static final String GET_ALL_WAREHOUSE = "/";
  public static final String GET_WAREHOUSE = "/{id}";
  public static final String PATCH_WAREHOUSE = "/{id}";
  public static final String CREATE_WAREHOUSE = "/create";
  public static final String DELETE_WAREHOUSE = "/delete/{id}";
}
