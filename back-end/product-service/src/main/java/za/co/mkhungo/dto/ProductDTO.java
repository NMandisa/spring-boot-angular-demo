package za.co.mkhungo.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

/**
 * @author Noxolo.Mkhungo
 */
@Data
@Builder
public class ProductDTO extends RepresentationModel {
    private Long id;
    private String name;
    private Long price;
}
