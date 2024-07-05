package za.co.mkhungo.facade;

import za.co.mkhungo.domain.Fulfiment;
import za.co.mkhungo.response.FulfilmentResponse;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface FulfilmentFacade extends Serializable {
    Collection<FulfilmentResponse> getFulfilments();
    Long save(Fulfiment product);
    FulfilmentResponse getFulfilment(Long id);
}
