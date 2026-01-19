package com.jenish.ecombackend.service;

import com.jenish.ecombackend.dto.request.AddToCartRequest;
import com.jenish.ecombackend.dto.response.CartItemResponse;
import com.jenish.ecombackend.model.CartItem;

import java.util.List;

/**
 * Service interface for Cart operations.
 */
public interface CartService {

    /**
     * Add an item to the cart.
     * If item already exists, updates the quantity.
     */
    CartItemResponse addToCart(AddToCartRequest request);

    /**
     * Get all cart items for a user with product details.
     */
    List<CartItemResponse> getCartByUserId(String userId);

    /**
     * Get cart items as entities (for internal use).
     */
    List<CartItem> getCartItemsByUserId(String userId);

    /**
     * Clear all items from a user's cart.
     */
    void clearCart(String userId);

    /**
     * Remove a specific item from the cart.
     */
    void removeCartItem(String userId, String productId);
}
