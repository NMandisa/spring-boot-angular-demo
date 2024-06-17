package za.co.mkhungo.common.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author Noxolo.Mkhungo
 */
@Data
@Builder
public class ProductDescriptionDTO {
    private Long id;
    private String description;
    private Long productId;
}
