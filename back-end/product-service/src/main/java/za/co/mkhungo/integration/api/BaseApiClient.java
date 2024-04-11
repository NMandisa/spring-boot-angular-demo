package za.co.mkhungo.integration.api;

import org.springframework.http.ResponseEntity;

/**
 * @author Noxolo.Mkhungo
 */
public interface BaseApiClient {
    ResponseEntity retrieveAll();
    ResponseEntity retrieveById(Long id);
}
