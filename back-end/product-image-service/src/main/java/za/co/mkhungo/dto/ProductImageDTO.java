package za.co.mkhungo.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author Noxolo.Mkhungo
 */
@Data
@Builder
public class ProductImageDTO {
    private Long id;
    private Long productId;
}
