package za.co.mkhungo.facade;

import za.co.mkhungo.response.ProductReviewResponse;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductReviewFacade extends Serializable {
    Collection<ProductReviewResponse> reviews();
}
