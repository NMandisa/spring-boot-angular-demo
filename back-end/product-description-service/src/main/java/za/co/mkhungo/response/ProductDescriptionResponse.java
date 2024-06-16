package za.co.mkhungo.response;

import lombok.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.hateoas.RepresentationModel;
import za.co.mkhungo.dto.ProductDescriptionDTO;

/**
 * @author Noxolo.Mkhungo
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDescriptionResponse extends RepresentationModel<ProductDescriptionResponse> {
    private ProductDescriptionDTO productDescription;

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ProductDescriptionResponse.class).toHashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProductDescriptionResponse other)) return false;
        return new EqualsBuilder().append(ProductDescriptionResponse.class, other.getClass()).isEquals();
    }
}
