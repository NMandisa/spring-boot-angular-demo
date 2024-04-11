package za.co.mkhungo.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author Noxolo.Mkhungo
 */
@Data
@Builder
public class ProductDTO {
    private Long id;
    private String name;
    private Long price;
}
