package za.co.mkhungo.service;

import za.co.mkhungo.response.ProductDescriptionResponse;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductDescriptionService extends Serializable {
    Collection<ProductDescriptionResponse> getProductDescriptions();
}
