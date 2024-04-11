package za.co.mkhungo.response;

import lombok.*;
import za.co.mkhungo.domain.ProductReview;

/**
 * @author Noxolo.Mkhungo
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductReviewResponse {
    private ProductReview product;
}
