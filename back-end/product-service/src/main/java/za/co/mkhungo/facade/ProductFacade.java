package za.co.mkhungo.facade;

import za.co.mkhungo.response.ProductResponse;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductFacade extends Serializable {
    Collection<ProductResponse> products();
}
