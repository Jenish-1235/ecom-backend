package com.jenish.ecombackend.model.enums;

/**
 * Enum representing the status of a payment.
 */
public enum PaymentStatus {
    
    PENDING,    // Payment initiated, awaiting response
    SUCCESS,    // Payment completed successfully
    FAILED      // Payment failed
}

