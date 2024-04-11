package za.co.mkhungo.response;

import lombok.*;
import za.co.mkhungo.domain.ProductDescription;

/**
 * @author Noxolo.Mkhungo
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDescriptionResponse {
    private ProductDescription product;
}
