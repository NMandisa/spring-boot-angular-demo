package za.co.mkhungo.common.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author Noxolo.Mkhungo
 */
@Data
@Builder
public class ProductReviewDTO {
    private Long id;
    private String review;
    private Long productId;
    private Long customerId;
}
