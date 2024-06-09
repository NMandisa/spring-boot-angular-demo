package za.co.mkhungo.facade;

import za.co.mkhungo.domain.CartItem;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface CartFacade {
    void addToCart(Long productId);
    int getTotalCartItems();
    Collection<CartItem> getCartItems();
    void removeCartItem(Long productId);
    void clearCart();
}
