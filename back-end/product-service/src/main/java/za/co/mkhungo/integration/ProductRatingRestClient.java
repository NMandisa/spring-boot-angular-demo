package za.co.mkhungo.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import za.co.mkhungo.dto.ProductDescriptionDTO;
import za.co.mkhungo.dto.ProductRatingDTO;
import za.co.mkhungo.exception.handler.ProductResponseErrorHandler;
import za.co.mkhungo.integration.api.AbstractApiClient;

/**
 * @author Noxolo.Mkhungo
 */
@Slf4j
@Component
public class ProductRatingRestClient extends AbstractApiClient {
    /*private final ProductResponseErrorHandler productResponseErrorHandler;
    private static final String PRODUCT_RATING_URI = "";
    private final RestClient restClient;
    public ProductRatingRestClient(ProductResponseErrorHandler productResponseErrorHandler, RestClient restClient) {
        this.productResponseErrorHandler = productResponseErrorHandler;
        this.restClient = restClient;
    }
    @Override
    public ResponseEntity<ProductRatingDTO> retrieveAll() {
        return  restClient.get().uri(PRODUCT_RATING_URI).retrieve().onStatus(productResponseErrorHandler).toEntity(ProductRatingDTO.class);
    }
    @Override
    public ResponseEntity<ProductRatingDTO>  retrieveById(Long id) {
        return restClient.get().uri(PRODUCT_RATING_URI+"/"+id).retrieve().onStatus(productResponseErrorHandler).toEntity(ProductRatingDTO.class);
    }

    *//**
     * @param productId
     * @return
     *//*
    @Override
    public ResponseEntity<ProductRatingDTO>  retrieveByProductId(Long productId) {
        return null;
    }*/
}
