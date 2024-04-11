package za.co.mkhungo.dto;

import lombok.Builder;
import lombok.Data;
import za.co.mkhungo.domain.enums.Rating;

/**
 * @author Noxolo.Mkhungo
 */
@Data
@Builder
public class ProductRatingDTO {
    private Long id;
    private Rating rating;

    private Long productId;
    private Long customerId;
}
