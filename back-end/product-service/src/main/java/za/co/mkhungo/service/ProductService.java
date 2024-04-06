package za.co.mkhungo.service;

import za.co.mkhungo.response.ProductResponse;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductService extends Serializable {
    Collection<ProductResponse> getProducts();
}
