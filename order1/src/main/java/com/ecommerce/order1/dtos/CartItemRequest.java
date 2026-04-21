package com.ecommerce.order1.dtos;

import lombok.Data;

@Data
public class CartItemRequest {
    private String productId;
    private Integer quantity;
}
