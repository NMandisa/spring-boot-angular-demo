package za.co.mkhungo.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import za.co.mkhungo.dto.ProductDescriptionDTO;
import za.co.mkhungo.exception.handler.ProductResponseErrorHandler;
import za.co.mkhungo.integration.api.AbstractApiClient;

/**
 * @author Noxolo.Mkhungo
 */
@Slf4j
@Component
public class ProductDescriptionRestClient extends AbstractApiClient {
    /*private final ProductResponseErrorHandler productResponseErrorHandler;
    private static final String PRODUCT_DESCRIPTION_URI = "";
   // private final RestClient restClient;
    @Autowired
    public ProductDescriptionRestClient(ProductResponseErrorHandler productResponseErrorHandler, RestClient restClient) {
        this.productResponseErrorHandler = productResponseErrorHandler;
        //this.restClient = restClient;
    }
    @Override
    public ResponseEntity<ProductDescriptionDTO> retrieveAll() {
        return null;
      // return  restClient.get().uri(PRODUCT_DESCRIPTION_URI).retrieve().onStatus(productResponseErrorHandler).toEntity(ProductDescriptionDTO.class);
    }
    @Override
    public ResponseEntity<ProductDescriptionDTO> retrieveById(Long id) {
        return null;
        //return restClient.get().uri(PRODUCT_DESCRIPTION_URI+"/"+id).retrieve().onStatus(productResponseErrorHandler).toEntity(ProductDescriptionDTO.class);
    }

    *//**
     * @param productId
     * @return
     *//*
    @Override
    public ResponseEntity<ProductDescriptionDTO>
    retrieveByProductId(Long productId) {
        return null;
    }*/
}
