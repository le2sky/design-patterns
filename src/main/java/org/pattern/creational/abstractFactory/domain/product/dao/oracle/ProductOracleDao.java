package org.pattern.creational.abstractFactory.domain.product.dao.oracle;

import org.pattern.creational.abstractFactory.domain.product.Product;
import org.pattern.creational.abstractFactory.domain.product.dao.ProductDao;


public class ProductOracleDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into Oracle productId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into Oracle productId = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete from Oracle productId = " + product.getProductId());
    }
}
