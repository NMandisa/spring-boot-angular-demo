package za.co.mkhungo.response;

import lombok.*;
import za.co.mkhungo.domain.Product;

/**
 * @author Noxolo.Mkhungo
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductResponse {
    private Product product;
}
