package com.jenish.ecombackend.service;

import com.jenish.ecombackend.dto.request.CreateOrderRequest;
import com.jenish.ecombackend.dto.response.OrderResponse;
import com.jenish.ecombackend.model.Order;

import java.util.List;

/**
 * Service interface for Order operations.
 */
public interface OrderService {

    /**
     * Create an order from the user's cart.
     */
    OrderResponse createOrder(CreateOrderRequest request);

    /**
     * Get order by ID.
     */
    OrderResponse getOrderById(String orderId);

    /**
     * Get order entity by ID (for internal use).
     */
    Order getOrderEntityById(String orderId);

    /**
     * Get all orders for a user.
     */
    List<OrderResponse> getOrdersByUserId(String userId);

    /**
     * Update order status to PAID.
     */
    void markOrderAsPaid(String orderId);

    /**
     * Update order status to FAILED.
     */
    void markOrderAsFailed(String orderId);

    /**
     * Cancel an order and restore stock.
     */
    OrderResponse cancelOrder(String orderId);
}
