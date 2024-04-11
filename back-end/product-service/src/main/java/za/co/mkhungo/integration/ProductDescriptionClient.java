package za.co.mkhungo.integration;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import za.co.mkhungo.dto.ProductDescriptionDTO;
import za.co.mkhungo.exception.handler.ProductResponseErrorHandler;
import za.co.mkhungo.integration.api.AbstractApiClient;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class ProductDescriptionClient extends AbstractApiClient {
    private final ProductResponseErrorHandler productResponseErrorHandler;
    private static final String PRODUCT_DESCRIPTION_URI = "";
    private final RestClient restClient;
    public ProductDescriptionClient(ProductResponseErrorHandler productResponseErrorHandler, RestClient restClient) {
        this.productResponseErrorHandler = productResponseErrorHandler;
        this.restClient = restClient;
    }
    @Override
    public ResponseEntity<ProductDescriptionDTO> retrieveAll() {
        return  restClient.get().uri(PRODUCT_DESCRIPTION_URI).retrieve().onStatus(productResponseErrorHandler).toEntity(ProductDescriptionDTO.class);
    }
    @Override
    public ResponseEntity<ProductDescriptionDTO> retrieveById(Long id) {
        return restClient.get().uri(PRODUCT_DESCRIPTION_URI+"/"+id).retrieve().onStatus(productResponseErrorHandler).toEntity(ProductDescriptionDTO.class);
    }
}
