package com.amr.notification.DTO;

import java.math.BigDecimal;

public record Product(
    Integer productId,
    String name,
    String description,
    BigDecimal price,
    double quantity
) {
}
