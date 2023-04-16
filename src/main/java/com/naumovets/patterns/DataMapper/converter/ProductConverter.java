package com.naumovets.patterns.DataMapper.converter;

import com.naumovets.patterns.DataMapper.dto.ProductDto;
import com.naumovets.patterns.DataMapper.entity.Product;

public class ProductConverter {
    public static ProductDto entityToDto(Product product) {
        return new ProductDto(product.getId(), product.getTitle(), product.getCost(), product.getCategory().getTitle());
    }
}
