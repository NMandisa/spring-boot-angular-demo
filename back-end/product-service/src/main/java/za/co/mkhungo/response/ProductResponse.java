package za.co.mkhungo.response;

import lombok.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.hateoas.RepresentationModel;
import za.co.mkhungo.dto.ProductDTO;
import za.co.mkhungo.dto.ProductDescriptionDTO;
import za.co.mkhungo.dto.ProductRatingDTO;
import za.co.mkhungo.dto.ProductReviewDTO;

/**
 * @author Noxolo.Mkhungo
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductResponse extends RepresentationModel<ProductResponse> {
    private ProductDTO productDto;
    private ProductDescriptionDTO descriptionDto;
    private ProductReviewDTO reviewDto;
    private ProductRatingDTO ratingDto;

    public ProductResponse(ProductDTO productDto){
        this.productDto=productDto;
    }

    public ProductResponse(ProductDTO productDto,ProductDescriptionDTO descriptionDto){
        this.productDto=productDto;
        this.descriptionDto=descriptionDto;
    }

    public ProductResponse(ProductDTO productDto,ProductDescriptionDTO descriptionDto,ProductReviewDTO reviewDto){
        this.productDto=productDto;
        this.descriptionDto=descriptionDto;
        this.reviewDto=reviewDto;
    }
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.getClass()).toHashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProductResponse other)) return false;
        return new EqualsBuilder().append(this.getClass(), other.getClass()).isEquals();
    }
}
