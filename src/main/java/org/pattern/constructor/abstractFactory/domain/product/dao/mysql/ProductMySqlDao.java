package org.pattern.constructor.abstractFactory.domain.product.dao.mysql;

import org.pattern.constructor.abstractFactory.domain.product.Product;
import org.pattern.constructor.abstractFactory.domain.product.dao.ProductDao;

public class ProductMySqlDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into Mysql productId = " + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into Mysql productId = " + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete from  Mysql productId = " + product.getProductId());
    }
}
