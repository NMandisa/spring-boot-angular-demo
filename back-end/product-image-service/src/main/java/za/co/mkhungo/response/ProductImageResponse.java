package za.co.mkhungo.response;

import lombok.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.hateoas.RepresentationModel;
import za.co.mkhungo.dto.ProductImageDTO;

/**
 * @author Noxolo.Mkhungo
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductImageResponse extends RepresentationModel<ProductImageResponse> {
    private ProductImageDTO productImageDTO;

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ProductImageResponse.class).toHashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProductImageResponse other)) return false;
        return new EqualsBuilder().append(ProductImageResponse.class, other.getClass()).isEquals();
    }
}
