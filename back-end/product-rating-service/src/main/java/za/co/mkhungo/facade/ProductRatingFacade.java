package za.co.mkhungo.facade;

import za.co.mkhungo.response.ProductRatingResponse;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductRatingFacade extends Serializable {
    Collection<ProductRatingResponse> productRatings();
}
