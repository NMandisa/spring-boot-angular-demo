package za.co.mkhungo.response;

import lombok.*;
import za.co.mkhungo.domain.ProductRating;

/**
 * @author Noxolo.Mkhungo
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductRatingResponse {
    private ProductRating product;
}
