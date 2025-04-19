package com.amr.ecommerce.mapper;

import com.amr.ecommerce.DTO.ProductPurchaseResponse;
import com.amr.ecommerce.DTO.ProductRequest;
import com.amr.ecommerce.DTO.ProductResponse;
import com.amr.ecommerce.model.Category;
import com.amr.ecommerce.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product toProduct(ProductRequest request) {
        return Product.builder()
            .id(request.id())
            .name(request.name())
            .description(request.description())
            .availableQuantity(request.availableQuantity())
            .price(request.price())
            .category(
                Category.builder()
                    .id(request.categoryId())
                    .build()
            )
            .build();
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getAvailableQuantity(),
            product.getPrice(),
            product.getCategory().getId(),
            product.getCategory().getName(),
            product.getCategory().getDescription()
        );
    }

    public ProductPurchaseResponse toproductPurchaseResponse(Product product, double quantity) {
        return new ProductPurchaseResponse(
            product.getId(),
            product.getName(),
            product.getDescription(),
            product.getPrice(),
            quantity
        );
    }

}
