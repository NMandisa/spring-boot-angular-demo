package za.co.mkhungo.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import za.co.mkhungo.integration.api.AbstractApiClient;

/**
 * @author Noxolo.Mkhungo
 */
@Slf4j
@Component
public class ProductReviewRestClient extends AbstractApiClient {
    /*private final ProductResponseErrorHandler productResponseErrorHandler;
    private static final String PRODUCT_REVIEW_URI = "";
    private final RestClient restClient;
    public ProductReviewRestClient(ProductResponseErrorHandler productResponseErrorHandler, RestClient restClient) {
        this.productResponseErrorHandler = productResponseErrorHandler;
        this.restClient = restClient;
    }
    @Override
    public ResponseEntity<ProductReviewDTO> retrieveAll() {
        return  restClient.get().uri(PRODUCT_REVIEW_URI).retrieve().onStatus(productResponseErrorHandler).toEntity(ProductReviewDTO.class);
    }
    @Override
    public ResponseEntity<ProductReviewDTO> retrieveById(Long id) {
        return restClient.get().uri(PRODUCT_REVIEW_URI+"/"+id).retrieve().onStatus(productResponseErrorHandler).toEntity(ProductReviewDTO.class);
    }

    *//**
     * @param productId
     * @return
     *//*
    @Override
    public ResponseEntity<ProductReviewDTO> retrieveByProductId(Long productId) {
        return null;
    }*/
}
