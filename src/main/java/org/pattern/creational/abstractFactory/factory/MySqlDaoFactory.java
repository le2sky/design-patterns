package org.pattern.creational.abstractFactory.factory;

import org.pattern.creational.abstractFactory.domain.product.dao.ProductDao;
import org.pattern.creational.abstractFactory.domain.product.dao.mysql.ProductMySqlDao;
import org.pattern.creational.abstractFactory.domain.userinfo.dao.UserinfoDao;
import org.pattern.creational.abstractFactory.domain.userinfo.dao.mysql.UserMySqlDao;

public class MySqlDaoFactory implements DaoFactory {
    @Override
    public UserinfoDao createUserInfoDao() {
        return new UserMySqlDao();
    }
    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}
