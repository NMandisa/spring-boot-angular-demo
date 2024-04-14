package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.StockFacade;
import za.co.mkhungo.service.StockService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultStockService implements StockService {
  private final StockFacade stockFacade;
  @Autowired
  public DefaultStockService(@Qualifier("defaultStockFacade") StockFacade stockFacade){
    this.stockFacade=stockFacade;
  }
}
