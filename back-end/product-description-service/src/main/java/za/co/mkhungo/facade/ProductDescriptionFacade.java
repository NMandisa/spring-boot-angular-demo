package za.co.mkhungo.facade;

import za.co.mkhungo.response.ProductDescriptionResponse;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductDescriptionFacade extends Serializable {
    Collection<ProductDescriptionResponse> productDescriptions();
}
