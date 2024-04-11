package za.co.mkhungo.service;

import za.co.mkhungo.response.ProductRatingResponse;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductRatingService extends Serializable {
    Collection<ProductRatingResponse> getProductRatings();
}
