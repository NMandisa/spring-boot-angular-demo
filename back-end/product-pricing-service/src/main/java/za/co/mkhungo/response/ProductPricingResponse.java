package za.co.mkhungo.response;

import lombok.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.hateoas.RepresentationModel;
import za.co.mkhungo.dto.ProductPricingDTO;

/**
 * @author Noxolo.Mkhungo
 */
@ToString
@NoArgsConstructor
@Getter
@Setter
public class ProductPricingResponse extends RepresentationModel<ProductPricingResponse> {
    private ProductPricingDTO productDto;
    public ProductPricingResponse(ProductPricingDTO productDto){
        this.productDto=productDto;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.getClass()).toHashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProductPricingResponse other)) return false;
        return new EqualsBuilder().append(this.getClass(), other.getClass()).isEquals();
    }
}
