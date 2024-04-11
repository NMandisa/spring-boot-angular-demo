package za.co.mkhungo.response;

import lombok.*;
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
public class ProductResponse {
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
}
