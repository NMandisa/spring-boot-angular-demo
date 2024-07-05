package za.co.mkhungo.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;
import za.co.mkhungo.exception.FulfilmentException;

import java.io.IOException;

/**
 * @author Noxolo.Mkhungo
 */
@Slf4j
@Component
public class FulfilmentResponseErrorHandler implements ResponseErrorHandler {
    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        //Logic
        return response.getStatusCode() == HttpStatus.OK && response.getStatusCode() == HttpStatus.ACCEPTED;
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        if (response.getStatusCode().is4xxClientError()){
            log.trace("Has Client Error "+response.getStatusCode(),new FulfilmentException());
        }
        if (response.getStatusCode().is5xxServerError()){
            log.trace("Has Server Error on ...",new FulfilmentException());
        }
    }
}
