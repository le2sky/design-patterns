package org.pattern.creational.abstractFactory.domain.product.dao;

import org.pattern.creational.abstractFactory.domain.product.Product;

public interface ProductDao {
    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
}
