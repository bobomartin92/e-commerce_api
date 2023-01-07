package dev.decagon.ecommerce.exceptions;

public class CartItemNotExistException extends Exception {
    public CartItemNotExistException(String msg) {
        super(msg);
    }
}