package za.co.mkhungo.service;

import za.co.mkhungo.response.ProductReviewResponse;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductReviewService extends Serializable {
    Collection<ProductReviewResponse> getProductReviews();
}
