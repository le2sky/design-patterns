package org.pattern.creational.abstractFactory.factory;

import org.pattern.creational.abstractFactory.domain.product.dao.ProductDao;
import org.pattern.creational.abstractFactory.domain.product.dao.oracle.ProductOracleDao;
import org.pattern.creational.abstractFactory.domain.userinfo.dao.UserinfoDao;
import org.pattern.creational.abstractFactory.domain.userinfo.dao.oracle.UserOracleDao;

public class OracleDaoFactory implements DaoFactory {

    @Override
    public UserinfoDao createUserInfoDao() {
        return new UserOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
