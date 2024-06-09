package za.co.mkhungo.facade.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.domain.CartItem;
import za.co.mkhungo.facade.CartFacade;
import za.co.mkhungo.repository.CartRepository;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@RequiredArgsConstructor
@Slf4j
public class DefaultCartFacade implements CartFacade {
  private CartRepository cartRepository;

  /**
   * @param productId
   */
  @Override
  public void addToCart(Long productId) {//TODO

  }

  /**
   * @return
   */
  @Override
  public int getTotalCartItems() {//TODO
    return 0;
  }

  /**
   * @return
   */
  @Override
  public Collection<CartItem> getCartItems() {//TODO
    return null;
  }

  /**
   * @param productId
   */
  @Override
  public void removeCartItem(Long productId) {//TODO
     }

  /**
   *
   */
  @Override
  public void clearCart() { //TODO
  }
}
