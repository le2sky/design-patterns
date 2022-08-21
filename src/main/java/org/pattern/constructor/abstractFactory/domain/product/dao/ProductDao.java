package org.pattern.constructor.abstractFactory.domain.product.dao;

import org.pattern.constructor.abstractFactory.domain.product.Product;

public interface ProductDao {
    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
}
